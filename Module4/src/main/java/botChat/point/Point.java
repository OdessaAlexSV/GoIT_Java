package main.java.botChat.point;

import java.util.Objects;

class Point {
    private int x;
    private int y;
    private int z;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object obj) {
        // If the object is compared with itself then return true
        if (obj == this) {
            return true;
        }
        // Check if o is an instance of Complex or not "null instanceof [type]" also returns false
        if (!(obj instanceof Point)) {
            return false;
        }

        // typecast o to Complex so that we can compare data members
        Point point = (Point) obj;
        // Compare the data members and return accordingly
        return (x == point.x) && (y == point.y) && (z == point.z);

    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, z);
    }
}
