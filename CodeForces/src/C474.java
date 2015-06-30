import java.util.Scanner;

public class C474 {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		int n = in.nextInt();

		for (int i = 0; i < n; ++i) {
			solve();
		}

	}

	private static void solve() {
		Point a = new Point(in.nextLong(), in.nextLong(), in.nextLong(),
				in.nextLong());
		Point b = new Point(in.nextLong(), in.nextLong(), in.nextLong(),
				in.nextLong());
		Point c = new Point(in.nextLong(), in.nextLong(), in.nextLong(),
				in.nextLong());
		Point d = new Point(in.nextLong(), in.nextLong(), in.nextLong(),
				in.nextLong());
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < 4; ++i) {
			Point e = a.rotate(i);
			for (int j = 0; j < 4; ++j) {
				Point f = b.rotate(j);
				for (int k = 0; k < 4; ++k) {
					Point g = c.rotate(k);
					for (int h = 0; h < 4; ++h) {
						Point l = d.rotate(h);
						long EF = e.distanceSquare(f);
						long EG = e.distanceSquare(g);
						long EL = e.distanceSquare(l);
						long FG = f.distanceSquare(g);
						long FL = f.distanceSquare(l);
						long GL = l.distanceSquare(g);
						if (EF == 0 || EG == 0 || EL == 0 || FG == 0 || FL == 0
								|| GL == 0) {
							continue;
						}
						if (EF == EG) {
							if (FL == GL && GL == EF) {
								Vector ef = new Vector(f.x - e.x, f.y - e.y);
								Vector eg = new Vector(g.x - e.x, g.y - e.y);
								if (ef.a * eg.a + ef.b * eg.b == 0) {
									min = Math.min(min, i + k + j + h);
								}
							}
						} else if (EF == EL) {
							if (FG == GL && GL == EF) {
								Vector ef = new Vector(f.x - e.x, f.y - e.y);
								Vector el = new Vector(l.x - e.x, l.y - e.y);
								if (ef.a * el.a + ef.b * el.b == 0) {
									min = Math.min(min, i + k + j + h);
								}
							}
						} else if (EG == EL) {
							if (FL == FG && FG == EL) {
								Vector el = new Vector(l.x - e.x, l.y - e.y);
								Vector eg = new Vector(g.x - e.x, g.y - e.y);
								if (el.a * eg.a + el.b * eg.b == 0) {
									min = Math.min(min, i + k + j + h);
								}
							}
						}
					}
				}
			}
		}

		System.out.println(min == Integer.MAX_VALUE ? -1 : min);
	}
}

class Point {
	long x;
	long y;
	long a;
	long b;

	public Point(long x, long y, long a, long b) {
		super();
		this.x = x;
		this.y = y;
		this.a = a;
		this.b = b;
	}

	public Point rotate() {
		long e = this.x - this.a;
		long f = this.y - this.b;

		long k = -f;
		long h = e;
		return new Point(k + a, h + b, a, b);
	}

	public Point rotate(int k) {
		Point a = new Point(this.x, this.y, this.a, this.b);
		for (int i = 0; i < k; ++i) {
			a = a.rotate();
		}
		return a;
	}

	public long distanceSquare(Point a) {
		return (this.x - a.x) * (this.x - a.x) + (this.y - a.y)
				* (this.y - a.y);
	}
}

class Vector {
	long a;
	long b;

	public Vector(long a, long b) {
		super();
		this.a = a;
		this.b = b;
	}

	public double Mulitply(Vector b) {
		return (a * b.a + this.b * b.b)
				* (a * b.a + this.b * b.b)
				/ ((this.a * this.a + this.b * this.b) * 1.0 * (b.a * b.a + b.b
						* b.b));
	}
}