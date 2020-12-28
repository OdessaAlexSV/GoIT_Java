package main.java.botChat.point;

import java.util.Objects;

public class StarTrack {

    private Point start;
    private Point finish;

    public void setStart(Point start) {
        this.start = start;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    public Point getStart() {
        return start;
    }

    public Point getFinish() {
        return finish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StarTrack track = (StarTrack) o;
         return start.getX() == track.start.getX() &&
                start.getY() == track.start.getY() &&
                start.getZ() == track.start.getZ() &&
                finish.getX() == track.finish.getX() &&
                finish.getY() == track.finish.getY() &&
                finish.getZ() == track.finish.getZ() ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start.getX(), start.getY(), start.getZ(), finish.getX(), finish.getY(), finish.getZ());
    }

}
