
class SegmentTree {
	private int[] tree;
	private int[] treeMax;
	private int[] treeMin;
	private int maxsize;
	private int height;

	private final int STARTINDEX = 0;
	private final int ENDINDEX;
	private final int ROOT = 0;

	private final int MAX = Integer.MAX_VALUE;
	private final int MIN = Integer.MIN_VALUE;

	public SegmentTree(int size) {
		height = (int) (Math.ceil(Math.log(size) / Math.log(2)));
		maxsize = 2 * (int) Math.pow(2, height) - 1;
		tree = new int[maxsize];
		ENDINDEX = size - 1;
		treeMax = new int[maxsize];
		treeMin = new int[maxsize];
	}
	private int leftchild(int pos) {
		return 2 * pos + 1;
	}
	private int rightchild(int pos) {
		return 2 * pos + 2;
	}
	private int mid(int start, int end) {
		return (start + (end - start) / 2);
	}
	private QueryResult getUtil(int startIndex, int endIndex, int queryStart,
			int queryEnd, int current) {
		if (queryStart <= startIndex && queryEnd >= endIndex) {
			return new QueryResult(treeMax[current], treeMin[current],
					tree[current]);
		}
		if (endIndex < queryStart || startIndex > queryEnd) {
			return new QueryResult(MIN, MAX, 0);
		}
		int mid = mid(startIndex, endIndex);
		QueryResult resultLeft = getUtil(startIndex, mid, queryStart, queryEnd,
				leftchild(current));
		QueryResult resultRight = getUtil(mid + 1, endIndex, queryStart,
				queryEnd, rightchild(current));
		int max = Math.max(resultLeft.max, resultRight.max);
		int min = Math.min(resultLeft.min, resultRight.min);
		int sum = resultLeft.sum + resultRight.sum;
		return new QueryResult(max, min, sum);
	}

	public QueryResult get(int queryStart, int queryEnd) {
		if (queryStart < 0 || queryEnd > tree.length) {
			return new QueryResult(MIN, MAX, 0);
		}
		return getUtil(STARTINDEX, ENDINDEX, queryStart, queryEnd, ROOT);
	}

	private QueryResult constructSegmentTreeUtil(int[] elements,
			int startIndex, int endIndex, int current) {
		if (startIndex == endIndex) {
			tree[current] = elements[startIndex];
			treeMax[current] = elements[startIndex];
			treeMin[current] = elements[startIndex];
			return new QueryResult(tree[current], tree[current], tree[current]);
		}
		int mid = mid(startIndex, endIndex);
		QueryResult resultLeft = constructSegmentTreeUtil(elements, startIndex,
				mid, leftchild(current));
		QueryResult resultRight = constructSegmentTreeUtil(elements, mid + 1,
				endIndex, rightchild(current));

		tree[current] = resultLeft.sum + resultRight.sum;
		treeMax[current] = Math.max(resultLeft.max, resultRight.max);
		treeMin[current] = Math.min(resultLeft.min, resultRight.min);
		return new QueryResult(treeMax[current], treeMin[current],
				tree[current]);
	}

	public void constructSegmentTree(int[] elements) {
		constructSegmentTreeUtil(elements, STARTINDEX, ENDINDEX, ROOT);
	}

	private void updateTreeUtil(int startIndex, int endIndex, int updatePos,
			int updateDiff, int current) {
		if (updatePos < startIndex || updatePos > endIndex) {
			return;
		}

		// treeMax[current] = treeMax[current] + update;
		// treeMin[current] = treeMin[current] + update;
		if (startIndex != endIndex) {
			int mid = mid(startIndex, endIndex);
			int rightNode = rightchild(current);
			int leftNode = leftchild(current);

			if (updatePos <= mid) {
				updateTreeUtil(startIndex, mid, updatePos, updateDiff,
						leftchild(current));

			} else {
				updateTreeUtil(mid + 1, endIndex, updatePos, updateDiff,
						rightchild(current));

			}
			tree[current] += updateDiff;
			treeMax[current] = Math.max(treeMax[leftNode], treeMax[rightNode]);
			treeMin[current] = Math.min(treeMin[leftNode], treeMin[rightNode]);

		} else {
			tree[current] += updateDiff;
			treeMax[current] = tree[current];
			treeMin[current] = tree[current];
		}

	}

	public void update(int update, int updatePos, int[] elements) {
		int updateDiff = update - elements[updatePos];
		elements[updatePos] = update;
		updateTreeUtil(STARTINDEX, ENDINDEX, updatePos, updateDiff, ROOT);
	}
}

class QueryResult {
	int max;
	int min;
	int sum;

	public QueryResult() {
		max = 0;
		min = 0;
		sum = 0;
	}

	public QueryResult(int max, int min, int sum) {
		super();
		this.max = max;
		this.min = min;
		this.sum = sum;
	}

}
