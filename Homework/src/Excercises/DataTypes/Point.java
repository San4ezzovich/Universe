package Excercises.DataTypes;

public record Point(int x, int y){
    public String toString() {
        return   x + " " + y;
    }
}