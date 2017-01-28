package com.dupletstudios.audio.network.ultrasonic;

/**
 * Created by adityathanekar on 28/01/17.
 */

public class JJRRealDoubleFFT extends b {
    public double norm_factor;
    private double[] a;
    private int b;

    public JJRRealDoubleFFT(int n) {
        this.b = n;
        this.norm_factor = (double)n;
        if(this.a == null || this.a.length != 2 * this.b + 15) {
            this.a = new double[2 * this.b + 15];
        }

        this.b(this.b, this.a);
    }

    public void ft(double[] x) {
        if(x.length != this.b) {
            throw new IllegalArgumentException("The length of data can not match that of the wavetable");
        } else {
            this.e(this.b, x, this.a);
        }
    }

    public void ft(double[] x, JJRComplex1D y) {
        if(x.length != this.b) {
            throw new IllegalArgumentException("The length of data can not match that of the wavetable");
        } else {
            this.e(this.b, x, this.a);
            if(this.b % 2 == 0) {
                y.x = new double[this.b / 2 + 1];
                y.y = new double[this.b / 2 + 1];
            } else {
                y.x = new double[(this.b + 1) / 2];
                y.y = new double[(this.b + 1) / 2];
            }

            y.x[0] = x[0];
            y.y[0] = 0.0D;

            for(int var3 = 1; var3 < (this.b + 1) / 2; ++var3) {
                y.x[var3] = x[2 * var3 - 1];
                y.y[var3] = x[2 * var3];
            }

            if(this.b % 2 == 0) {
                y.x[this.b / 2] = x[this.b - 1];
                y.y[this.b / 2] = 0.0D;
            }

        }
    }

    public void bt(double[] x) {
        if(x.length != this.b) {
            throw new IllegalArgumentException("The length of data can not match that of the wavetable");
        } else {
            this.f(this.b, x, this.a);
        }
    }

    public void bt(JJRComplex1D x, double[] y) {
        if(this.b % 2 == 0) {
            if(x.x.length != this.b / 2 + 1) {
                throw new IllegalArgumentException("The length of data can not match that of the wavetable");
            }
        } else if(x.x.length != (this.b + 1) / 2) {
            throw new IllegalArgumentException("The length of data can not match that of the wavetable");
        }

        y[0] = x.x[0];

        for(int var3 = 1; var3 < (this.b + 1) / 2; ++var3) {
            y[2 * var3 - 1] = x.x[var3];
            y[2 * var3] = x.y[var3];
        }

        if(this.b % 2 == 0) {
            y[this.b - 1] = x.x[this.b / 2];
        }

        this.f(this.b, y, this.a);
    }
}
