/**
 * NBody
 *
 *
 * https://zh.wikipedia.org/wiki/%E4%B8%87%E6%9C%89%E5%BC%95%E5%8A%9B%E5%AE%9A%E5%BE%8B   牛顿万有引力定律
 *
 * 这个项目 直接使用javac  java 来编译运行
 * javac -unicode utf-8 NBody.java TestCalForceExerted.java
 * 需要几个文件 就编译几个文件
 *
 * 有些单词不理解的多查查字段
 *
 * project0 的目的主要还是熟悉 java
 *
 * 课程 主要还是推荐多使用 命令行的工具。。少用图形界面。。
 *
 * 上课 ppt guide -> dis-> lab -hw -> project -> exam
 * 一周一周的任务完成。。严格的按照步骤
 * 尽量独立自主的完成。。。
 * 这样的容易立即一些。。
 * 学习的方法。。。
 *
 */
public class NBody {

    /** 
     * Return the radius of the universe reading from the file 
     */
    public static double readRadius(String fileName) {
        In in = new In(fileName);
        in.readInt();
        double Radius = in.readDouble();

        return Radius;
    }

    /** 
     * Return an array of Bodys corresponding to the bodies in the file 
     */
    public static Body[] readBodies(String fileName) {
        In in = new In(fileName);
        int num = in.readInt();
        in.readDouble();
        Body[] Planets = new Body[num];
        
        int i = 0;
        while (i < num) {
            double xP = in.readDouble();
            double yP = in.readDouble();
            double xV = in.readDouble();
            double yV = in.readDouble();
            double m = in.readDouble();
            String img = in.readString();
            Planets[i++] = new Body(xP, yP, xV, yV, m, img);
        }
        return Planets;
    }

    /** 
     * Draw the initial universe state 
     */
    public static void main(String[] args) {
        /** 
         * Get data 
         */
        double T = Double.parseDouble(args[0]);
        double dt = Double.parseDouble(args[1]);
        String fileName = args[2];
        double uniRadius = NBody.readRadius(fileName);
        Body[] Planets = NBody.readBodies(fileName);

        /** 
         * Draw the background 
         */
        StdDraw.setScale(-uniRadius, uniRadius);
        StdDraw.clear();
        StdDraw.picture(0, 0, "images/starfield.jpg");

        /** 
         * Draw planets 
         */
        for (Body planet : Planets) {
            planet.draw();
        }

        /**
         * Animation
         */
        StdDraw.enableDoubleBuffering();
        /**
         * Set up a loop to loop until time variable reaches T
         */
        for (double t = 0; t <= T; t += dt) {
            double[] xForces = new double[Planets.length];
            double[] yForces = new double[Planets.length];
            /**
             * Calculate the net forces for every planet
             */
            for (int i = 0; i < Planets.length; i++) {
                xForces[i] = Planets[i].calcNetForceExertedByX(Planets);
                yForces[i] = Planets[i].calcNetForceExertedByY(Planets);
            }
            /**
             * Update positions and velocities of each planet
             */
            for (int i = 0; i < Planets.length; i++) {
                Planets[i].update(dt, xForces[i], yForces[i]);
            }
            /**
             * Draw the background
             */
            StdDraw.picture(0, 0, "images/starfield.jpg");
            /**
             * Draw all planets
             */
            for (Body planet : Planets) {
                planet.draw();
            }
            StdDraw.show();
            StdDraw.pause(10);

        }
        
        /**
         * Print out the final state of the universe when time reaches T
         */
        StdOut.printf("%d\n", Planets.length);
        StdOut.printf("%.2e\n", uniRadius);
        for (int i = 0; i < Planets.length; i++) {
            StdOut.printf("%11.4e %11.4e %11.4e %11.4e %11.4e %12s\n",
                          Planets[i].xxPos, Planets[i].yyPos, Planets[i].xxVel,
                          Planets[i].yyVel, Planets[i].mass, Planets[i].imgFileName);   

        }

    }

}