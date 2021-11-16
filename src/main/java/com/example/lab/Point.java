package com.example.lab;

public class Point {
        private int x;
        private int y;

        public Point(int initialX, int initialY) {
            x = initialX;
            y = initialY;
        }

        public void move(int dx, int dy) {
            this.x= dx;
            this.y= dy;
        }

        public void setX(int newX) {
            this.x=newX;
        }

        public void setY(int newY) {
            this.y = newY;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }

        public String toString() {
            return "(" + x + "," + y + ")";
        }

        /* returns true if this point has the
         * same contents as otherPoint and
         * false otherwise */
        public boolean equals(Point otherPoint) {
            if (this.x == otherPoint.x && this.y == otherPoint.y) {
                return true;
            } else {
                return false;
            }
        }
    }

