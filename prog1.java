class rectangle{
    double height;
    double width;
    rectangle(double height, double width){
        this.height=height;
        this.width=width;
    }

    void area(){
        System.out.println("Area is",height*width);
    }
    void perimeter(){
        System.out.println("Perimeter is",2*(height+width));
    }
}
class main{
    public static void main(String[] args){
        rectangle rect=new rectangle(2,4);
	rect.area();
	rect.perimeter();
    }
}
