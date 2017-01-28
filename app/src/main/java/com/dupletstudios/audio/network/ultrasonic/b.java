package com.dupletstudios.audio.network.ultrasonic;

/**
 * Created by adityathanekar on 28/01/17.
 */
class b {
    b() {
    }

    void a(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        int var14 = var6;

        int var8;
        for(var8 = 0; var8 < var2; ++var8) {
            var4[2 * var8 * var1] = var3[var8 * var1] + var3[(var8 + var2) * var1];
            var4[(2 * var8 + 1) * var1 + var1 - 1] = var3[var8 * var1] - var3[(var8 + var2) * var1];
        }

        if(var1 >= 2) {
            if(var1 != 2) {
                for(var8 = 0; var8 < var2; ++var8) {
                    for(int var7 = 2; var7 < var1; var7 += 2) {
                        int var9 = var1 - var7;
                        double var12 = var5[var7 - 2 + var14] * var3[var7 - 1 + (var8 + var2) * var1] + var5[var7 - 1 + var14] * var3[var7 + (var8 + var2) * var1];
                        double var10 = var5[var7 - 2 + var14] * var3[var7 + (var8 + var2) * var1] - var5[var7 - 1 + var14] * var3[var7 - 1 + (var8 + var2) * var1];
                        var4[var7 + 2 * var8 * var1] = var3[var7 + var8 * var1] + var10;
                        var4[var9 + (2 * var8 + 1) * var1] = var10 - var3[var7 + var8 * var1];
                        var4[var7 - 1 + 2 * var8 * var1] = var3[var7 - 1 + var8 * var1] + var12;
                        var4[var9 - 1 + (2 * var8 + 1) * var1] = var3[var7 - 1 + var8 * var1] - var12;
                    }
                }

                if(var1 % 2 == 1) {
                    return;
                }
            }

            for(var8 = 0; var8 < var2; ++var8) {
                var4[(2 * var8 + 1) * var1] = -var3[var1 - 1 + (var8 + var2) * var1];
                var4[var1 - 1 + 2 * var8 * var1] = var3[var1 - 1 + var8 * var1];
            }

        }
    }

    void b(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        int var14 = var6;

        int var8;
        for(var8 = 0; var8 < var2; ++var8) {
            var4[var8 * var1] = var3[2 * var8 * var1] + var3[var1 - 1 + (2 * var8 + 1) * var1];
            var4[(var8 + var2) * var1] = var3[2 * var8 * var1] - var3[var1 - 1 + (2 * var8 + 1) * var1];
        }

        if(var1 >= 2) {
            if(var1 != 2) {
                for(var8 = 0; var8 < var2; ++var8) {
                    for(int var7 = 2; var7 < var1; var7 += 2) {
                        int var9 = var1 - var7;
                        var4[var7 - 1 + var8 * var1] = var3[var7 - 1 + 2 * var8 * var1] + var3[var9 - 1 + (2 * var8 + 1) * var1];
                        double var12 = var3[var7 - 1 + 2 * var8 * var1] - var3[var9 - 1 + (2 * var8 + 1) * var1];
                        var4[var7 + var8 * var1] = var3[var7 + 2 * var8 * var1] - var3[var9 + (2 * var8 + 1) * var1];
                        double var10 = var3[var7 + 2 * var8 * var1] + var3[var9 + (2 * var8 + 1) * var1];
                        var4[var7 - 1 + (var8 + var2) * var1] = var5[var7 - 2 + var14] * var12 - var5[var7 - 1 + var14] * var10;
                        var4[var7 + (var8 + var2) * var1] = var5[var7 - 2 + var14] * var10 + var5[var7 - 1 + var14] * var12;
                    }
                }

                if(var1 % 2 == 1) {
                    return;
                }
            }

            for(var8 = 0; var8 < var2; ++var8) {
                var4[var1 - 1 + var8 * var1] = 2.0D * var3[var1 - 1 + 2 * var8 * var1];
                var4[var1 - 1 + (var8 + var2) * var1] = -2.0D * var3[(2 * var8 + 1) * var1];
            }

        }
    }

    void c(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = -0.5D;
        double var9 = 0.866025403784439D;
        int var34 = var6;
        int var35 = var6 + var1;

        int var12;
        double var20;
        for(var12 = 0; var12 < var2; ++var12) {
            var20 = var3[(var12 + var2) * var1] + var3[(var12 + 2 * var2) * var1];
            var4[3 * var12 * var1] = var3[var12 * var1] + var20;
            var4[(3 * var12 + 2) * var1] = 0.866025403784439D * (var3[(var12 + var2 * 2) * var1] - var3[(var12 + var2) * var1]);
            var4[var1 - 1 + (3 * var12 + 1) * var1] = var3[var12 * var1] + -0.5D * var20;
        }

        if(var1 != 1) {
            for(var12 = 0; var12 < var2; ++var12) {
                for(int var11 = 2; var11 < var1; var11 += 2) {
                    int var13 = var1 - var11;
                    double var22 = var5[var11 - 2 + var34] * var3[var11 - 1 + (var12 + var2) * var1] + var5[var11 - 1 + var34] * var3[var11 + (var12 + var2) * var1];
                    double var16 = var5[var11 - 2 + var34] * var3[var11 + (var12 + var2) * var1] - var5[var11 - 1 + var34] * var3[var11 - 1 + (var12 + var2) * var1];
                    double var24 = var5[var11 - 2 + var35] * var3[var11 - 1 + (var12 + var2 * 2) * var1] + var5[var11 - 1 + var35] * var3[var11 + (var12 + var2 * 2) * var1];
                    double var18 = var5[var11 - 2 + var35] * var3[var11 + (var12 + var2 * 2) * var1] - var5[var11 - 1 + var35] * var3[var11 - 1 + (var12 + var2 * 2) * var1];
                    var20 = var22 + var24;
                    double var14 = var16 + var18;
                    var4[var11 - 1 + 3 * var12 * var1] = var3[var11 - 1 + var12 * var1] + var20;
                    var4[var11 + 3 * var12 * var1] = var3[var11 + var12 * var1] + var14;
                    double var30 = var3[var11 - 1 + var12 * var1] + -0.5D * var20;
                    double var26 = var3[var11 + var12 * var1] + -0.5D * var14;
                    double var32 = 0.866025403784439D * (var16 - var18);
                    double var28 = 0.866025403784439D * (var24 - var22);
                    var4[var11 - 1 + (3 * var12 + 2) * var1] = var30 + var32;
                    var4[var13 - 1 + (3 * var12 + 1) * var1] = var30 - var32;
                    var4[var11 + (3 * var12 + 2) * var1] = var26 + var28;
                    var4[var13 + (3 * var12 + 1) * var1] = var28 - var26;
                }
            }

        }
    }

    void d(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = -0.5D;
        double var9 = 0.866025403784439D;
        int var34 = var6;
        int var35 = var6 + var1;

        double var32;
        int var12;
        double var16;
        double var22;
        for(var12 = 0; var12 < var2; ++var12) {
            var32 = 2.0D * var3[var1 - 1 + (3 * var12 + 1) * var1];
            var22 = var3[3 * var12 * var1] + -0.5D * var32;
            var4[var12 * var1] = var3[3 * var12 * var1] + var32;
            var16 = 1.732050807568878D * var3[(3 * var12 + 2) * var1];
            var4[(var12 + var2) * var1] = var22 - var16;
            var4[(var12 + 2 * var2) * var1] = var22 + var16;
        }

        if(var1 != 1) {
            for(var12 = 0; var12 < var2; ++var12) {
                for(int var11 = 2; var11 < var1; var11 += 2) {
                    int var13 = var1 - var11;
                    var32 = var3[var11 - 1 + (3 * var12 + 2) * var1] + var3[var13 - 1 + (3 * var12 + 1) * var1];
                    var22 = var3[var11 - 1 + 3 * var12 * var1] + -0.5D * var32;
                    var4[var11 - 1 + var12 * var1] = var3[var11 - 1 + 3 * var12 * var1] + var32;
                    double var30 = var3[var11 + (3 * var12 + 2) * var1] - var3[var13 + (3 * var12 + 1) * var1];
                    double var14 = var3[var11 + 3 * var12 * var1] + -0.5D * var30;
                    var4[var11 + var12 * var1] = var3[var11 + 3 * var12 * var1] + var30;
                    double var24 = 0.866025403784439D * (var3[var11 - 1 + (3 * var12 + 2) * var1] - var3[var13 - 1 + (3 * var12 + 1) * var1]);
                    var16 = 0.866025403784439D * (var3[var11 + (3 * var12 + 2) * var1] + var3[var13 + (3 * var12 + 1) * var1]);
                    double var26 = var22 - var16;
                    double var28 = var22 + var16;
                    double var18 = var14 + var24;
                    double var20 = var14 - var24;
                    var4[var11 - 1 + (var12 + var2) * var1] = var5[var11 - 2 + var34] * var26 - var5[var11 - 1 + var34] * var18;
                    var4[var11 + (var12 + var2) * var1] = var5[var11 - 2 + var34] * var18 + var5[var11 - 1 + var34] * var26;
                    var4[var11 - 1 + (var12 + 2 * var2) * var1] = var5[var11 - 2 + var35] * var28 - var5[var11 - 1 + var35] * var20;
                    var4[var11 + (var12 + 2 * var2) * var1] = var5[var11 - 2 + var35] * var20 + var5[var11 - 1 + var35] * var28;
                }
            }

        }
    }

    void e(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = 0.7071067811865475D;
        int var40 = var6;
        int var41 = var6 + var1;
        int var42 = var41 + var1;

        int var10;
        double var32;
        double var34;
        for(var10 = 0; var10 < var2; ++var10) {
            var32 = var3[(var10 + var2) * var1] + var3[(var10 + 3 * var2) * var1];
            var34 = var3[var10 * var1] + var3[(var10 + 2 * var2) * var1];
            var4[4 * var10 * var1] = var32 + var34;
            var4[var1 - 1 + (4 * var10 + 3) * var1] = var34 - var32;
            var4[var1 - 1 + (4 * var10 + 1) * var1] = var3[var10 * var1] - var3[(var10 + 2 * var2) * var1];
            var4[(4 * var10 + 2) * var1] = var3[(var10 + 3 * var2) * var1] - var3[(var10 + var2) * var1];
        }

        if(var1 >= 2) {
            double var24;
            if(var1 != 2) {
                for(var10 = 0; var10 < var2; ++var10) {
                    for(int var9 = 2; var9 < var1; var9 += 2) {
                        int var11 = var1 - var9;
                        double var18 = var5[var9 - 2 + var40] * var3[var9 - 1 + (var10 + var2) * var1] + var5[var9 - 1 + var40] * var3[var9 + (var10 + var2) * var1];
                        double var12 = var5[var9 - 2 + var40] * var3[var9 + (var10 + var2) * var1] - var5[var9 - 1 + var40] * var3[var9 - 1 + (var10 + var2) * var1];
                        double var20 = var5[var9 - 2 + var41] * var3[var9 - 1 + (var10 + 2 * var2) * var1] + var5[var9 - 1 + var41] * var3[var9 + (var10 + 2 * var2) * var1];
                        double var14 = var5[var9 - 2 + var41] * var3[var9 + (var10 + 2 * var2) * var1] - var5[var9 - 1 + var41] * var3[var9 - 1 + (var10 + 2 * var2) * var1];
                        double var22 = var5[var9 - 2 + var42] * var3[var9 - 1 + (var10 + 3 * var2) * var1] + var5[var9 - 1 + var42] * var3[var9 + (var10 + 3 * var2) * var1];
                        double var16 = var5[var9 - 2 + var42] * var3[var9 + (var10 + 3 * var2) * var1] - var5[var9 - 1 + var42] * var3[var9 - 1 + (var10 + 3 * var2) * var1];
                        var32 = var18 + var22;
                        double var38 = var22 - var18;
                        var24 = var12 + var16;
                        double var30 = var12 - var16;
                        double var26 = var3[var9 + var10 * var1] + var14;
                        double var28 = var3[var9 + var10 * var1] - var14;
                        var34 = var3[var9 - 1 + var10 * var1] + var20;
                        double var36 = var3[var9 - 1 + var10 * var1] - var20;
                        var4[var9 - 1 + 4 * var10 * var1] = var32 + var34;
                        var4[var11 - 1 + (4 * var10 + 3) * var1] = var34 - var32;
                        var4[var9 + 4 * var10 * var1] = var24 + var26;
                        var4[var11 + (4 * var10 + 3) * var1] = var24 - var26;
                        var4[var9 - 1 + (4 * var10 + 2) * var1] = var30 + var36;
                        var4[var11 - 1 + (4 * var10 + 1) * var1] = var36 - var30;
                        var4[var9 + (4 * var10 + 2) * var1] = var38 + var28;
                        var4[var11 + (4 * var10 + 1) * var1] = var38 - var28;
                    }
                }

                if(var1 % 2 == 1) {
                    return;
                }
            }

            for(var10 = 0; var10 < var2; ++var10) {
                var24 = -0.7071067811865475D * (var3[var1 - 1 + (var10 + var2) * var1] + var3[var1 - 1 + (var10 + 3 * var2) * var1]);
                var32 = 0.7071067811865475D * (var3[var1 - 1 + (var10 + var2) * var1] - var3[var1 - 1 + (var10 + 3 * var2) * var1]);
                var4[var1 - 1 + 4 * var10 * var1] = var32 + var3[var1 - 1 + var10 * var1];
                var4[var1 - 1 + (4 * var10 + 2) * var1] = var3[var1 - 1 + var10 * var1] - var32;
                var4[(4 * var10 + 1) * var1] = var24 - var3[var1 - 1 + (var10 + 2 * var2) * var1];
                var4[(4 * var10 + 3) * var1] = var24 + var3[var1 - 1 + (var10 + 2 * var2) * var1];
            }

        }
    }

    void f(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = 1.414213562373095D;
        int var40 = var6;
        int var41 = var6 + var1;
        int var42 = var41 + var1;

        int var10;
        double var32;
        double var34;
        double var36;
        double var38;
        for(var10 = 0; var10 < var2; ++var10) {
            var32 = var3[4 * var10 * var1] - var3[var1 - 1 + (4 * var10 + 3) * var1];
            var34 = var3[4 * var10 * var1] + var3[var1 - 1 + (4 * var10 + 3) * var1];
            var36 = var3[var1 - 1 + (4 * var10 + 1) * var1] + var3[var1 - 1 + (4 * var10 + 1) * var1];
            var38 = var3[(4 * var10 + 2) * var1] + var3[(4 * var10 + 2) * var1];
            var4[var10 * var1] = var34 + var36;
            var4[(var10 + var2) * var1] = var32 - var38;
            var4[(var10 + 2 * var2) * var1] = var34 - var36;
            var4[(var10 + 3 * var2) * var1] = var32 + var38;
        }

        if(var1 >= 2) {
            double var24;
            double var26;
            if(var1 != 2) {
                for(var10 = 0; var10 < var2; ++var10) {
                    for(int var9 = 2; var9 < var1; var9 += 2) {
                        int var11 = var1 - var9;
                        var24 = var3[var9 + 4 * var10 * var1] + var3[var11 + (4 * var10 + 3) * var1];
                        var26 = var3[var9 + 4 * var10 * var1] - var3[var11 + (4 * var10 + 3) * var1];
                        double var28 = var3[var9 + (4 * var10 + 2) * var1] - var3[var11 + (4 * var10 + 1) * var1];
                        var38 = var3[var9 + (4 * var10 + 2) * var1] + var3[var11 + (4 * var10 + 1) * var1];
                        var32 = var3[var9 - 1 + 4 * var10 * var1] - var3[var11 - 1 + (4 * var10 + 3) * var1];
                        var34 = var3[var9 - 1 + 4 * var10 * var1] + var3[var11 - 1 + (4 * var10 + 3) * var1];
                        double var30 = var3[var9 - 1 + (4 * var10 + 2) * var1] - var3[var11 - 1 + (4 * var10 + 1) * var1];
                        var36 = var3[var9 - 1 + (4 * var10 + 2) * var1] + var3[var11 - 1 + (4 * var10 + 1) * var1];
                        var4[var9 - 1 + var10 * var1] = var34 + var36;
                        double var20 = var34 - var36;
                        var4[var9 + var10 * var1] = var26 + var28;
                        double var14 = var26 - var28;
                        double var18 = var32 - var38;
                        double var22 = var32 + var38;
                        double var12 = var24 + var30;
                        double var16 = var24 - var30;
                        var4[var9 - 1 + (var10 + var2) * var1] = var5[var9 - 2 + var40] * var18 - var5[var9 - 1 + var40] * var12;
                        var4[var9 + (var10 + var2) * var1] = var5[var9 - 2 + var40] * var12 + var5[var9 - 1 + var40] * var18;
                        var4[var9 - 1 + (var10 + 2 * var2) * var1] = var5[var9 - 2 + var41] * var20 - var5[var9 - 1 + var41] * var14;
                        var4[var9 + (var10 + 2 * var2) * var1] = var5[var9 - 2 + var41] * var14 + var5[var9 - 1 + var41] * var20;
                        var4[var9 - 1 + (var10 + 3 * var2) * var1] = var5[var9 - 2 + var42] * var22 - var5[var9 - 1 + var42] * var16;
                        var4[var9 + (var10 + 3 * var2) * var1] = var5[var9 - 2 + var42] * var16 + var5[var9 - 1 + var42] * var22;
                    }
                }

                if(var1 % 2 == 1) {
                    return;
                }
            }

            for(var10 = 0; var10 < var2; ++var10) {
                var24 = var3[(4 * var10 + 1) * var1] + var3[(4 * var10 + 3) * var1];
                var26 = var3[(4 * var10 + 3) * var1] - var3[(4 * var10 + 1) * var1];
                var32 = var3[var1 - 1 + 4 * var10 * var1] - var3[var1 - 1 + (4 * var10 + 2) * var1];
                var34 = var3[var1 - 1 + 4 * var10 * var1] + var3[var1 - 1 + (4 * var10 + 2) * var1];
                var4[var1 - 1 + var10 * var1] = var34 + var34;
                var4[var1 - 1 + (var10 + var2) * var1] = 1.414213562373095D * (var32 - var24);
                var4[var1 - 1 + (var10 + 2 * var2) * var1] = var26 + var26;
                var4[var1 - 1 + (var10 + 3 * var2) * var1] = -1.414213562373095D * (var32 + var24);
            }

        }
    }

    void g(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = 0.309016994374947D;
        double var9 = 0.951056516295154D;
        double var11 = -0.809016994374947D;
        double var13 = 0.587785252292473D;
        int var66 = var6;
        int var67 = var6 + var1;
        int var68 = var67 + var1;
        int var69 = var68 + var1;

        int var16;
        double var22;
        double var24;
        double var34;
        double var36;
        for(var16 = 0; var16 < var2; ++var16) {
            var34 = var3[(var16 + 4 * var2) * var1] + var3[(var16 + var2) * var1];
            var24 = var3[(var16 + 4 * var2) * var1] - var3[(var16 + var2) * var1];
            var36 = var3[(var16 + 3 * var2) * var1] + var3[(var16 + 2 * var2) * var1];
            var22 = var3[(var16 + 3 * var2) * var1] - var3[(var16 + 2 * var2) * var1];
            var4[5 * var16 * var1] = var3[var16 * var1] + var34 + var36;
            var4[var1 - 1 + (5 * var16 + 1) * var1] = var3[var16 * var1] + 0.309016994374947D * var34 + -0.809016994374947D * var36;
            var4[(5 * var16 + 2) * var1] = 0.951056516295154D * var24 + 0.587785252292473D * var22;
            var4[var1 - 1 + (5 * var16 + 3) * var1] = var3[var16 * var1] + -0.809016994374947D * var34 + 0.309016994374947D * var36;
            var4[(5 * var16 + 4) * var1] = 0.587785252292473D * var24 - 0.951056516295154D * var22;
        }

        if(var1 != 1) {
            for(var16 = 0; var16 < var2; ++var16) {
                for(int var15 = 2; var15 < var1; var15 += 2) {
                    int var17 = var1 - var15;
                    double var38 = var5[var15 - 2 + var66] * var3[var15 - 1 + (var16 + var2) * var1] + var5[var15 - 1 + var66] * var3[var15 + (var16 + var2) * var1];
                    double var20 = var5[var15 - 2 + var66] * var3[var15 + (var16 + var2) * var1] - var5[var15 - 1 + var66] * var3[var15 - 1 + (var16 + var2) * var1];
                    double var40 = var5[var15 - 2 + var67] * var3[var15 - 1 + (var16 + 2 * var2) * var1] + var5[var15 - 1 + var67] * var3[var15 + (var16 + 2 * var2) * var1];
                    double var26 = var5[var15 - 2 + var67] * var3[var15 + (var16 + 2 * var2) * var1] - var5[var15 - 1 + var67] * var3[var15 - 1 + (var16 + 2 * var2) * var1];
                    double var42 = var5[var15 - 2 + var68] * var3[var15 - 1 + (var16 + 3 * var2) * var1] + var5[var15 - 1 + var68] * var3[var15 + (var16 + 3 * var2) * var1];
                    double var28 = var5[var15 - 2 + var68] * var3[var15 + (var16 + 3 * var2) * var1] - var5[var15 - 1 + var68] * var3[var15 - 1 + (var16 + 3 * var2) * var1];
                    double var44 = var5[var15 - 2 + var69] * var3[var15 - 1 + (var16 + 4 * var2) * var1] + var5[var15 - 1 + var69] * var3[var15 + (var16 + 4 * var2) * var1];
                    double var30 = var5[var15 - 2 + var69] * var3[var15 + (var16 + 4 * var2) * var1] - var5[var15 - 1 + var69] * var3[var15 - 1 + (var16 + 4 * var2) * var1];
                    var34 = var38 + var44;
                    var24 = var44 - var38;
                    double var46 = var20 - var30;
                    double var18 = var20 + var30;
                    var36 = var40 + var42;
                    var22 = var42 - var40;
                    double var48 = var26 - var28;
                    double var32 = var26 + var28;
                    var4[var15 - 1 + 5 * var16 * var1] = var3[var15 - 1 + var16 * var1] + var34 + var36;
                    var4[var15 + 5 * var16 * var1] = var3[var15 + var16 * var1] + var18 + var32;
                    double var58 = var3[var15 - 1 + var16 * var1] + 0.309016994374947D * var34 + -0.809016994374947D * var36;
                    double var50 = var3[var15 + var16 * var1] + 0.309016994374947D * var18 + -0.809016994374947D * var32;
                    double var60 = var3[var15 - 1 + var16 * var1] + -0.809016994374947D * var34 + 0.309016994374947D * var36;
                    double var52 = var3[var15 + var16 * var1] + -0.809016994374947D * var18 + 0.309016994374947D * var32;
                    double var64 = 0.951056516295154D * var46 + 0.587785252292473D * var48;
                    double var54 = 0.951056516295154D * var24 + 0.587785252292473D * var22;
                    double var62 = 0.587785252292473D * var46 - 0.951056516295154D * var48;
                    double var56 = 0.587785252292473D * var24 - 0.951056516295154D * var22;
                    var4[var15 - 1 + (5 * var16 + 2) * var1] = var58 + var64;
                    var4[var17 - 1 + (5 * var16 + 1) * var1] = var58 - var64;
                    var4[var15 + (5 * var16 + 2) * var1] = var50 + var54;
                    var4[var17 + (5 * var16 + 1) * var1] = var54 - var50;
                    var4[var15 - 1 + (5 * var16 + 4) * var1] = var60 + var62;
                    var4[var17 - 1 + (5 * var16 + 3) * var1] = var60 - var62;
                    var4[var15 + (5 * var16 + 4) * var1] = var52 + var56;
                    var4[var17 + (5 * var16 + 3) * var1] = var56 - var52;
                }
            }

        }
    }

    void h(int var1, int var2, double[] var3, double[] var4, double[] var5, int var6) {
        double var7 = 0.309016994374947D;
        double var9 = 0.951056516295154D;
        double var11 = -0.809016994374947D;
        double var13 = 0.587785252292473D;
        int var66 = var6;
        int var67 = var6 + var1;
        int var68 = var67 + var1;
        int var69 = var68 + var1;

        int var16;
        double var22;
        double var24;
        double var34;
        double var36;
        double var46;
        double var48;
        double var58;
        double var60;
        for(var16 = 0; var16 < var2; ++var16) {
            var48 = 2.0D * var3[(5 * var16 + 2) * var1];
            var46 = 2.0D * var3[(5 * var16 + 4) * var1];
            var58 = 2.0D * var3[var1 - 1 + (5 * var16 + 1) * var1];
            var60 = 2.0D * var3[var1 - 1 + (5 * var16 + 3) * var1];
            var4[var16 * var1] = var3[5 * var16 * var1] + var58 + var60;
            var34 = var3[5 * var16 * var1] + 0.309016994374947D * var58 + -0.809016994374947D * var60;
            var36 = var3[5 * var16 * var1] + -0.809016994374947D * var58 + 0.309016994374947D * var60;
            var24 = 0.951056516295154D * var48 + 0.587785252292473D * var46;
            var22 = 0.587785252292473D * var48 - 0.951056516295154D * var46;
            var4[(var16 + var2) * var1] = var34 - var24;
            var4[(var16 + 2 * var2) * var1] = var36 - var22;
            var4[(var16 + 3 * var2) * var1] = var36 + var22;
            var4[(var16 + 4 * var2) * var1] = var34 + var24;
        }

        if(var1 != 1) {
            for(var16 = 0; var16 < var2; ++var16) {
                for(int var15 = 2; var15 < var1; var15 += 2) {
                    int var17 = var1 - var15;
                    var48 = var3[var15 + (5 * var16 + 2) * var1] + var3[var17 + (5 * var16 + 1) * var1];
                    double var42 = var3[var15 + (5 * var16 + 2) * var1] - var3[var17 + (5 * var16 + 1) * var1];
                    var46 = var3[var15 + (5 * var16 + 4) * var1] + var3[var17 + (5 * var16 + 3) * var1];
                    double var44 = var3[var15 + (5 * var16 + 4) * var1] - var3[var17 + (5 * var16 + 3) * var1];
                    double var64 = var3[var15 - 1 + (5 * var16 + 2) * var1] - var3[var17 - 1 + (5 * var16 + 1) * var1];
                    var58 = var3[var15 - 1 + (5 * var16 + 2) * var1] + var3[var17 - 1 + (5 * var16 + 1) * var1];
                    double var62 = var3[var15 - 1 + (5 * var16 + 4) * var1] - var3[var17 - 1 + (5 * var16 + 3) * var1];
                    var60 = var3[var15 - 1 + (5 * var16 + 4) * var1] + var3[var17 - 1 + (5 * var16 + 3) * var1];
                    var4[var15 - 1 + var16 * var1] = var3[var15 - 1 + 5 * var16 * var1] + var58 + var60;
                    var4[var15 + var16 * var1] = var3[var15 + 5 * var16 * var1] + var42 + var44;
                    var34 = var3[var15 - 1 + 5 * var16 * var1] + 0.309016994374947D * var58 + -0.809016994374947D * var60;
                    double var18 = var3[var15 + 5 * var16 * var1] + 0.309016994374947D * var42 + -0.809016994374947D * var44;
                    var36 = var3[var15 - 1 + 5 * var16 * var1] + -0.809016994374947D * var58 + 0.309016994374947D * var60;
                    double var20 = var3[var15 + 5 * var16 * var1] + -0.809016994374947D * var42 + 0.309016994374947D * var44;
                    double var38 = 0.951056516295154D * var64 + 0.587785252292473D * var62;
                    var24 = 0.951056516295154D * var48 + 0.587785252292473D * var46;
                    double var40 = 0.587785252292473D * var64 - 0.951056516295154D * var62;
                    var22 = 0.587785252292473D * var48 - 0.951056516295154D * var46;
                    double var50 = var36 - var22;
                    double var52 = var36 + var22;
                    double var26 = var20 + var40;
                    double var28 = var20 - var40;
                    double var54 = var34 + var24;
                    double var56 = var34 - var24;
                    double var30 = var18 - var38;
                    double var32 = var18 + var38;
                    var4[var15 - 1 + (var16 + var2) * var1] = var5[var15 - 2 + var66] * var56 - var5[var15 - 1 + var66] * var32;
                    var4[var15 + (var16 + var2) * var1] = var5[var15 - 2 + var66] * var32 + var5[var15 - 1 + var66] * var56;
                    var4[var15 - 1 + (var16 + 2 * var2) * var1] = var5[var15 - 2 + var67] * var50 - var5[var15 - 1 + var67] * var26;
                    var4[var15 + (var16 + 2 * var2) * var1] = var5[var15 - 2 + var67] * var26 + var5[var15 - 1 + var67] * var50;
                    var4[var15 - 1 + (var16 + 3 * var2) * var1] = var5[var15 - 2 + var68] * var52 - var5[var15 - 1 + var68] * var28;
                    var4[var15 + (var16 + 3 * var2) * var1] = var5[var15 - 2 + var68] * var28 + var5[var15 - 1 + var68] * var52;
                    var4[var15 - 1 + (var16 + 4 * var2) * var1] = var5[var15 - 2 + var69] * var54 - var5[var15 - 1 + var69] * var30;
                    var4[var15 + (var16 + 4 * var2) * var1] = var5[var15 - 2 + var69] * var30 + var5[var15 - 1 + var69] * var54;
                }
            }

        }
    }

    void a(int var1, int var2, int var3, int var4, double[] var5, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
        double var12 = 6.283185307179586D;
        int var49 = var11;
        double var41 = 6.283185307179586D / (double)var2;
        double var39 = Math.cos(var41);
        double var43 = Math.sin(var41);
        int var15 = (var2 + 1) / 2;
        int var26 = (var1 - 1) / 2;
        int var16;
        int var17;
        int var18;
        int var22;
        int var24;
        if(var1 != 1) {
            for(var24 = 0; var24 < var4; ++var24) {
                var9[var24] = var7[var24];
            }

            for(var17 = 1; var17 < var2; ++var17) {
                for(var18 = 0; var18 < var3; ++var18) {
                    var8[(var18 + var17 * var3) * var1] = var6[(var18 + var17 * var3) * var1];
                }
            }

            int var14;
            int var25;
            if(var26 <= var3) {
                var25 = -var1;

                for(var17 = 1; var17 < var2; ++var17) {
                    var25 += var1;
                    var14 = var25 - 1;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        var14 += 2;

                        for(var18 = 0; var18 < var3; ++var18) {
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var6[var16 - 1 + (var18 + var17 * var3) * var1] + var10[var14 + var49] * var6[var16 + (var18 + var17 * var3) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var6[var16 + (var18 + var17 * var3) * var1] - var10[var14 + var49] * var6[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            } else {
                var25 = -var1;

                for(var17 = 1; var17 < var2; ++var17) {
                    var25 += var1;

                    for(var18 = 0; var18 < var3; ++var18) {
                        var14 = var25 - 1;

                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var14 += 2;
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var6[var16 - 1 + (var18 + var17 * var3) * var1] + var10[var14 + var49] * var6[var16 + (var18 + var17 * var3) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var6[var16 + (var18 + var17 * var3) * var1] - var10[var14 + var49] * var6[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            }

            if(var26 >= var3) {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var18 = 0; var18 < var3; ++var18) {
                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var6[var16 - 1 + (var18 + var17 * var3) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] + var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var6[var16 - 1 + (var18 + var22 * var3) * var1] = var8[var16 + (var18 + var17 * var3) * var1] - var8[var16 + (var18 + var22 * var3) * var1];
                            var6[var16 + (var18 + var17 * var3) * var1] = var8[var16 + (var18 + var17 * var3) * var1] + var8[var16 + (var18 + var22 * var3) * var1];
                            var6[var16 + (var18 + var22 * var3) * var1] = var8[var16 - 1 + (var18 + var22 * var3) * var1] - var8[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            } else {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        for(var18 = 0; var18 < var3; ++var18) {
                            var6[var16 - 1 + (var18 + var17 * var3) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] + var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var6[var16 - 1 + (var18 + var22 * var3) * var1] = var8[var16 + (var18 + var17 * var3) * var1] - var8[var16 + (var18 + var22 * var3) * var1];
                            var6[var16 + (var18 + var17 * var3) * var1] = var8[var16 + (var18 + var17 * var3) * var1] + var8[var16 + (var18 + var22 * var3) * var1];
                            var6[var16 + (var18 + var22 * var3) * var1] = var8[var16 - 1 + (var18 + var22 * var3) * var1] - var8[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            }
        } else {
            for(var24 = 0; var24 < var4; ++var24) {
                var7[var24] = var9[var24];
            }
        }

        for(var17 = 1; var17 < var15; ++var17) {
            var22 = var2 - var17;

            for(var18 = 0; var18 < var3; ++var18) {
                var6[(var18 + var17 * var3) * var1] = var8[(var18 + var17 * var3) * var1] + var8[(var18 + var22 * var3) * var1];
                var6[(var18 + var22 * var3) * var1] = var8[(var18 + var22 * var3) * var1] - var8[(var18 + var17 * var3) * var1];
            }
        }

        double var33 = 1.0D;
        double var29 = 0.0D;

        for(int var19 = 1; var19 < var15; ++var19) {
            int var23 = var2 - var19;
            double var45 = var39 * var33 - var43 * var29;
            var29 = var39 * var29 + var43 * var33;
            var33 = var45;

            for(var24 = 0; var24 < var4; ++var24) {
                var9[var24 + var19 * var4] = var7[var24] + var33 * var7[var24 + var4];
                var9[var24 + var23 * var4] = var29 * var7[var24 + (var2 - 1) * var4];
            }

            double var27 = var33;
            double var37 = var29;
            double var35 = var33;
            double var31 = var29;

            for(var17 = 2; var17 < var15; ++var17) {
                var22 = var2 - var17;
                double var47 = var27 * var35 - var37 * var31;
                var31 = var27 * var31 + var37 * var35;
                var35 = var47;

                for(var24 = 0; var24 < var4; ++var24) {
                    var9[var24 + var19 * var4] += var35 * var7[var24 + var17 * var4];
                    var9[var24 + var23 * var4] += var31 * var7[var24 + var22 * var4];
                }
            }
        }

        for(var17 = 1; var17 < var15; ++var17) {
            for(var24 = 0; var24 < var4; ++var24) {
                var9[var24] += var7[var24 + var17 * var4];
            }
        }

        if(var1 >= var3) {
            for(var18 = 0; var18 < var3; ++var18) {
                for(var16 = 0; var16 < var1; ++var16) {
                    var5[var16 + var18 * var2 * var1] = var8[var16 + var18 * var1];
                }
            }
        } else {
            for(var16 = 0; var16 < var1; ++var16) {
                for(var18 = 0; var18 < var3; ++var18) {
                    var5[var16 + var18 * var2 * var1] = var8[var16 + var18 * var1];
                }
            }
        }

        int var20;
        for(var17 = 1; var17 < var15; ++var17) {
            var22 = var2 - var17;
            var20 = 2 * var17;

            for(var18 = 0; var18 < var3; ++var18) {
                var5[var1 - 1 + (var20 - 1 + var18 * var2) * var1] = var8[(var18 + var17 * var3) * var1];
                var5[(var20 + var18 * var2) * var1] = var8[(var18 + var22 * var3) * var1];
            }
        }

        if(var1 != 1) {
            int var21;
            if(var26 >= var3) {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;
                    var20 = 2 * var17;

                    for(var18 = 0; var18 < var3; ++var18) {
                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var21 = var1 - var16;
                            var5[var16 - 1 + (var20 + var18 * var2) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] + var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var5[var21 - 1 + (var20 - 1 + var18 * var2) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] - var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var5[var16 + (var20 + var18 * var2) * var1] = var8[var16 + (var18 + var17 * var3) * var1] + var8[var16 + (var18 + var22 * var3) * var1];
                            var5[var21 + (var20 - 1 + var18 * var2) * var1] = var8[var16 + (var18 + var22 * var3) * var1] - var8[var16 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            } else {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;
                    var20 = 2 * var17;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        var21 = var1 - var16;

                        for(var18 = 0; var18 < var3; ++var18) {
                            var5[var16 - 1 + (var20 + var18 * var2) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] + var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var5[var21 - 1 + (var20 - 1 + var18 * var2) * var1] = var8[var16 - 1 + (var18 + var17 * var3) * var1] - var8[var16 - 1 + (var18 + var22 * var3) * var1];
                            var5[var16 + (var20 + var18 * var2) * var1] = var8[var16 + (var18 + var17 * var3) * var1] + var8[var16 + (var18 + var22 * var3) * var1];
                            var5[var21 + (var20 - 1 + var18 * var2) * var1] = var8[var16 + (var18 + var22 * var3) * var1] - var8[var16 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            }

        }
    }

    void b(int var1, int var2, int var3, int var4, double[] var5, double[] var6, double[] var7, double[] var8, double[] var9, double[] var10, int var11) {
        double var12 = 6.283185307179586D;
        int var49 = var11;
        double var41 = 6.283185307179586D / (double)var2;
        double var39 = Math.cos(var41);
        double var43 = Math.sin(var41);
        int var38 = (var1 - 1) / 2;
        int var15 = (var2 + 1) / 2;
        int var16;
        int var18;
        if(var1 >= var3) {
            for(var18 = 0; var18 < var3; ++var18) {
                for(var16 = 0; var16 < var1; ++var16) {
                    var8[var16 + var18 * var1] = var5[var16 + var18 * var2 * var1];
                }
            }
        } else {
            for(var16 = 0; var16 < var1; ++var16) {
                for(var18 = 0; var18 < var3; ++var18) {
                    var8[var16 + var18 * var1] = var5[var16 + var18 * var2 * var1];
                }
            }
        }

        int var17;
        int var22;
        for(var17 = 1; var17 < var15; ++var17) {
            var22 = var2 - var17;
            int var20 = 2 * var17;

            for(var18 = 0; var18 < var3; ++var18) {
                var8[(var18 + var17 * var3) * var1] = var5[var1 - 1 + (var20 - 1 + var18 * var2) * var1] + var5[var1 - 1 + (var20 - 1 + var18 * var2) * var1];
                var8[(var18 + var22 * var3) * var1] = var5[(var20 + var18 * var2) * var1] + var5[(var20 + var18 * var2) * var1];
            }
        }

        if(var1 != 1) {
            int var21;
            if(var38 >= var3) {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var18 = 0; var18 < var3; ++var18) {
                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var21 = var1 - var16;
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var5[var16 - 1 + (2 * var17 + var18 * var2) * var1] + var5[var21 - 1 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 - 1 + (var18 + var22 * var3) * var1] = var5[var16 - 1 + (2 * var17 + var18 * var2) * var1] - var5[var21 - 1 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var5[var16 + (2 * var17 + var18 * var2) * var1] - var5[var21 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 + (var18 + var22 * var3) * var1] = var5[var16 + (2 * var17 + var18 * var2) * var1] + var5[var21 + (2 * var17 - 1 + var18 * var2) * var1];
                        }
                    }
                }
            } else {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        var21 = var1 - var16;

                        for(var18 = 0; var18 < var3; ++var18) {
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var5[var16 - 1 + (2 * var17 + var18 * var2) * var1] + var5[var21 - 1 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 - 1 + (var18 + var22 * var3) * var1] = var5[var16 - 1 + (2 * var17 + var18 * var2) * var1] - var5[var21 - 1 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var5[var16 + (2 * var17 + var18 * var2) * var1] - var5[var21 + (2 * var17 - 1 + var18 * var2) * var1];
                            var8[var16 + (var18 + var22 * var3) * var1] = var5[var16 + (2 * var17 + var18 * var2) * var1] + var5[var21 + (2 * var17 - 1 + var18 * var2) * var1];
                        }
                    }
                }
            }
        }

        double var32 = 1.0D;
        double var28 = 0.0D;

        int var24;
        for(int var19 = 1; var19 < var15; ++var19) {
            int var23 = var2 - var19;
            double var45 = var39 * var32 - var43 * var28;
            var28 = var39 * var28 + var43 * var32;
            var32 = var45;

            for(var24 = 0; var24 < var4; ++var24) {
                var7[var24 + var19 * var4] = var9[var24] + var32 * var9[var24 + var4];
                var7[var24 + var23 * var4] = var28 * var9[var24 + (var2 - 1) * var4];
            }

            double var26 = var32;
            double var36 = var28;
            double var34 = var32;
            double var30 = var28;

            for(var17 = 2; var17 < var15; ++var17) {
                var22 = var2 - var17;
                double var47 = var26 * var34 - var36 * var30;
                var30 = var26 * var30 + var36 * var34;
                var34 = var47;

                for(var24 = 0; var24 < var4; ++var24) {
                    var7[var24 + var19 * var4] += var34 * var9[var24 + var17 * var4];
                    var7[var24 + var23 * var4] += var30 * var9[var24 + var22 * var4];
                }
            }
        }

        for(var17 = 1; var17 < var15; ++var17) {
            for(var24 = 0; var24 < var4; ++var24) {
                var9[var24] += var9[var24 + var17 * var4];
            }
        }

        for(var17 = 1; var17 < var15; ++var17) {
            var22 = var2 - var17;

            for(var18 = 0; var18 < var3; ++var18) {
                var8[(var18 + var17 * var3) * var1] = var6[(var18 + var17 * var3) * var1] - var6[(var18 + var22 * var3) * var1];
                var8[(var18 + var22 * var3) * var1] = var6[(var18 + var17 * var3) * var1] + var6[(var18 + var22 * var3) * var1];
            }
        }

        if(var1 != 1) {
            if(var38 >= var3) {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var18 = 0; var18 < var3; ++var18) {
                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var6[var16 - 1 + (var18 + var17 * var3) * var1] - var6[var16 + (var18 + var22 * var3) * var1];
                            var8[var16 - 1 + (var18 + var22 * var3) * var1] = var6[var16 - 1 + (var18 + var17 * var3) * var1] + var6[var16 + (var18 + var22 * var3) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var6[var16 + (var18 + var17 * var3) * var1] + var6[var16 - 1 + (var18 + var22 * var3) * var1];
                            var8[var16 + (var18 + var22 * var3) * var1] = var6[var16 + (var18 + var17 * var3) * var1] - var6[var16 - 1 + (var18 + var22 * var3) * var1];
                        }
                    }
                }
            } else {
                for(var17 = 1; var17 < var15; ++var17) {
                    var22 = var2 - var17;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        for(var18 = 0; var18 < var3; ++var18) {
                            var8[var16 - 1 + (var18 + var17 * var3) * var1] = var6[var16 - 1 + (var18 + var17 * var3) * var1] - var6[var16 + (var18 + var22 * var3) * var1];
                            var8[var16 - 1 + (var18 + var22 * var3) * var1] = var6[var16 - 1 + (var18 + var17 * var3) * var1] + var6[var16 + (var18 + var22 * var3) * var1];
                            var8[var16 + (var18 + var17 * var3) * var1] = var6[var16 + (var18 + var17 * var3) * var1] + var6[var16 - 1 + (var18 + var22 * var3) * var1];
                            var8[var16 + (var18 + var22 * var3) * var1] = var6[var16 + (var18 + var17 * var3) * var1] - var6[var16 - 1 + (var18 + var22 * var3) * var1];
                        }
                    }
                }
            }

            for(var24 = 0; var24 < var4; ++var24) {
                var7[var24] = var9[var24];
            }

            for(var17 = 1; var17 < var2; ++var17) {
                for(var18 = 0; var18 < var3; ++var18) {
                    var6[(var18 + var17 * var3) * var1] = var8[(var18 + var17 * var3) * var1];
                }
            }

            int var14;
            int var25;
            if(var38 <= var3) {
                var25 = -var1;

                for(var17 = 1; var17 < var2; ++var17) {
                    var25 += var1;
                    var14 = var25 - 1;

                    for(var16 = 2; var16 < var1; var16 += 2) {
                        var14 += 2;

                        for(var18 = 0; var18 < var3; ++var18) {
                            var6[var16 - 1 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var8[var16 - 1 + (var18 + var17 * var3) * var1] - var10[var14 + var49] * var8[var16 + (var18 + var17 * var3) * var1];
                            var6[var16 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var8[var16 + (var18 + var17 * var3) * var1] + var10[var14 + var49] * var8[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            } else {
                var25 = -var1;

                for(var17 = 1; var17 < var2; ++var17) {
                    var25 += var1;

                    for(var18 = 0; var18 < var3; ++var18) {
                        var14 = var25 - 1;

                        for(var16 = 2; var16 < var1; var16 += 2) {
                            var14 += 2;
                            var6[var16 - 1 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var8[var16 - 1 + (var18 + var17 * var3) * var1] - var10[var14 + var49] * var8[var16 + (var18 + var17 * var3) * var1];
                            var6[var16 + (var18 + var17 * var3) * var1] = var10[var14 - 1 + var49] * var8[var16 + (var18 + var17 * var3) * var1] + var10[var14 + var49] * var8[var16 - 1 + (var18 + var17 * var3) * var1];
                        }
                    }
                }
            }

        }
    }

    void a(int var1, double[] var2, double[] var3, int var4) {
        double[] var16 = new double[var1];
        System.arraycopy(var3, var4, var16, 0, var1);
        int var11 = (int)var3[1 + 2 * var1 + var4];
        int var9 = 1;
        int var8 = var1;
        int var13 = var1 - 1 + var1 + var4;

        for(int var6 = 1; var6 <= var11; ++var6) {
            int var10 = var11 - var6;
            int var12 = (int)var3[var10 + 2 + 2 * var1 + var4];
            int var7 = var8 / var12;
            int var14 = var1 / var8;
            int var15 = var14 * var7;
            var13 -= (var12 - 1) * var14;
            var9 = 1 - var9;
            if(var12 == 4) {
                if(var9 == 0) {
                    this.e(var14, var7, var2, var16, var3, var13);
                } else {
                    this.e(var14, var7, var16, var2, var3, var13);
                }
            } else if(var12 == 2) {
                if(var9 == 0) {
                    this.a(var14, var7, var2, var16, var3, var13);
                } else {
                    this.a(var14, var7, var16, var2, var3, var13);
                }
            } else if(var12 == 3) {
                if(var9 == 0) {
                    this.c(var14, var7, var2, var16, var3, var13);
                } else {
                    this.c(var14, var7, var16, var2, var3, var13);
                }
            } else if(var12 == 5) {
                if(var9 == 0) {
                    this.g(var14, var7, var2, var16, var3, var13);
                } else {
                    this.g(var14, var7, var16, var2, var3, var13);
                }
            } else {
                if(var14 == 1) {
                    var9 = 1 - var9;
                }

                if(var9 == 0) {
                    this.a(var14, var12, var7, var15, var2, var2, var2, var16, var16, var3, var13);
                    var9 = 1;
                } else {
                    this.a(var14, var12, var7, var15, var16, var16, var16, var2, var2, var3, var13);
                    var9 = 0;
                }
            }

            var8 = var7;
        }

        if(var9 != 1) {
            for(int var5 = 0; var5 < var1; ++var5) {
                var2[var5] = var16[var5];
            }

        }
    }

    void b(int var1, double[] var2, double[] var3, int var4) {
        double[] var15 = new double[var1];
        System.arraycopy(var3, var4, var15, 0, var1);
        int var10 = (int)var3[1 + 2 * var1 + var4];
        int var9 = 0;
        int var7 = 1;
        int var12 = var1 + var4;

        for(int var6 = 1; var6 <= var10; ++var6) {
            int var11 = (int)var3[var6 + 1 + 2 * var1 + var4];
            int var8 = var11 * var7;
            int var13 = var1 / var8;
            int var14 = var13 * var7;
            if(var11 == 4) {
                if(var9 == 0) {
                    this.f(var13, var7, var2, var15, var3, var12);
                } else {
                    this.f(var13, var7, var15, var2, var3, var12);
                }

                var9 = 1 - var9;
            } else if(var11 == 2) {
                if(var9 == 0) {
                    this.b(var13, var7, var2, var15, var3, var12);
                } else {
                    this.b(var13, var7, var15, var2, var3, var12);
                }

                var9 = 1 - var9;
            } else if(var11 == 3) {
                if(var9 == 0) {
                    this.d(var13, var7, var2, var15, var3, var12);
                } else {
                    this.d(var13, var7, var15, var2, var3, var12);
                }

                var9 = 1 - var9;
            } else if(var11 == 5) {
                if(var9 == 0) {
                    this.h(var13, var7, var2, var15, var3, var12);
                } else {
                    this.h(var13, var7, var15, var2, var3, var12);
                }

                var9 = 1 - var9;
            } else {
                if(var9 == 0) {
                    this.b(var13, var11, var7, var14, var2, var2, var2, var15, var15, var3, var12);
                } else {
                    this.b(var13, var11, var7, var14, var15, var15, var15, var2, var2, var3, var12);
                }

                if(var13 == 1) {
                    var9 = 1 - var9;
                }
            }

            var7 = var8;
            var12 += (var11 - 1) * var13;
        }

        if(var9 != 0) {
            for(int var5 = 0; var5 < var1; ++var5) {
                var2[var5] = var15[var5];
            }

        }
    }

    void e(int var1, double[] var2, double[] var3) {
        if(var1 != 1) {
            this.a(var1, var2, var3, 0);
        }
    }

    void f(int var1, double[] var2, double[] var3) {
        if(var1 != 1) {
            this.b(var1, var2, var3, 0);
        }
    }

    void a(int var1, double[] var2, int var3) {
        int[] var4 = new int[]{4, 2, 3, 5};
        double var5 = 6.283185307179586D;
        int var9 = 0;
        int var24 = var1;
        int var22 = 0;
        int var11 = 0;

        label67:
        while(true) {
            ++var11;
            if(var11 <= 4) {
                var9 = var4[var11 - 1];
            } else {
                var9 += 2;
            }

            int var10;
            int var26;
            do {
                var26 = var24 / var9;
                int var27 = var24 - var9 * var26;
                if(var27 != 0) {
                    continue label67;
                }

                ++var22;
                var2[var22 + 1 + 2 * var1 + var3] = (double)var9;
                var24 = var26;
                if(var9 == 2 && var22 != 1) {
                    for(var10 = 2; var10 <= var22; ++var10) {
                        int var17 = var22 - var10 + 2;
                        var2[var17 + 1 + 2 * var1 + var3] = var2[var17 + 2 * var1 + var3];
                    }

                    var2[2 + 2 * var1 + var3] = 2.0D;
                }
            } while(var26 != 1);

            var2[0 + 2 * var1 + var3] = (double)var1;
            var2[1 + 2 * var1 + var3] = (double)var22;
            double var7 = 6.283185307179586D / (double)var1;
            int var25 = 0;
            int var32 = var22 - 1;
            int var15 = 1;
            if(var32 == 0) {
                return;
            }

            for(int var14 = 1; var14 <= var32; ++var14) {
                int var23 = (int)var2[var14 + 1 + 2 * var1 + var3];
                int var20 = 0;
                int var16 = var15 * var23;
                int var30 = var1 / var16;
                int var31 = var23 - 1;

                for(var11 = 1; var11 <= var31; ++var11) {
                    var20 += var15;
                    var10 = var25;
                    double var12 = (double)var20 * var7;
                    double var18 = 0.0D;

                    for(int var21 = 3; var21 <= var30; var21 += 2) {
                        var10 += 2;
                        ++var18;
                        double var28 = var18 * var12;
                        var2[var10 - 2 + var1 + var3] = Math.cos(var28);
                        var2[var10 - 1 + var1 + var3] = Math.sin(var28);
                    }

                    var25 += var30;
                }

                var15 = var16;
            }

            return;
        }
    }

    void b(int var1, double[] var2) {
        if(var1 != 1) {
            this.a(var1, var2, 0);
        }
    }
}

