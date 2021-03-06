package academy.codingexercise31;

import academy.codingexercise37.Wall;

public class Wall1 {
    private double width;
    private double height;

    public Wall1(){

    }

    public Wall1(double width, double height) {
        this.width = (width<0) ? 0 : width;
        this.height = (height<0) ? 0 : height;
    }

    public double getWidth(){
        return this.width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setWidth(double width){
        this.width = width < 0 ? 0 : width;
    }

    public void setHeight(double height){
        this.height = height < 0 ? 0 : height;
    }

    public double getArea(){
        return width*height;
    }

    public static void main(String[] args) {
        Wall1 wall = new Wall1(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("are= " + wall.getArea());

    }

}
