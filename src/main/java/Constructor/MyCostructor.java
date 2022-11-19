package Constructor;

public class MyCostructor {


    int x = 3;
    int y = 5;


    MyCostructor(){
        x+=1;
        System.out.println("-x" + x);
    }

    MyCostructor( int i){
        this();

        this.y=i;
        x+= y;
        System.out.println("-x"+ x);
    }

    MyCostructor (int i, int i2){
        this(3);
        this.x -=4;
        System.out.println("-x" + x);
    }

    public static void main(String[] args) {
        MyCostructor mc1 = new MyCostructor(4, 3);

    }

}
