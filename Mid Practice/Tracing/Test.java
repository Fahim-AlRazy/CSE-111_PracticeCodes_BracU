class Test {
  int m, n = 1;
  
  int metA(int n){
    n += m + 3;
    int s = n+ this.n;
    if (s%2 == 0) return s;
    Test t = new Test();
    t.n = (++this.m) - (++m) + t.m;
    this.n = n + t.metA(t.m);
    System.out.printf("%d %d %d\n", m, n, s);
    return s+this.n;
  }
}
