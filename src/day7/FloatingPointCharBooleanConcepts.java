package day7;

public class FloatingPointCharBooleanConcepts {
    public static void main(String[] args) {
        //float - 4 Byte = 4*8 = 32 bits
        //Range - up to 6-7 digits post decimal
        float f1 = 12.123456789f;
        System.out.println(f1);

        float f2 = (float) 14.987654321;
        System.out.println(f2);

        //double - 8 Bytes = 8*8= 64 bits
        //Range  - upto 15/16 decimal places

        double d1 = 12.123456789123456789;
        System.out.println(d1);

        //char -- 2 bytes
        //range ---a-z, 1-9, A-Z, !@#$%^&*()-+

        char c1 = 'a';//97
        char c2 = 'b';//98
        char c3 = '1'; //49
        char c4 = 'J';
        char c5 = '=';

        char gender = 'm';
        char status = 'Y';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);
        System.out.println(c5);
        System.out.println(gender);
        System.out.println(status);

        System.out.println("=============================Char Numeric Behaviour=======");

        System.out.println(c1 * c2);//ab, a+b, ....
        System.out.println(c2 + c3);

        char u1 = 'a';//97
        char u2 = 'b';//98

        System.out.println((int) u1);
        System.out.println((int) u2);

        System.out.println(u1 + u2); //195
        System.out.println(u1 + (int) u2);//97+98=195
        System.out.println((int) u1 + (int) u2);//195

        System.out.println((char) 97);//a
        System.out.println((char) 98);//b
        System.out.println((int) 'a');//97
        System.out.println((int) 'b');//98

        System.out.println((char) 97 + (char) 98);
        System.out.println(u1 + 0);
        System.out.println(u1+'0');//97+ 48

        //boolean ~ 1 bit
        // range  - true, false

        boolean b1= true;
        boolean b2= false;

        System.out.println(10>20);


    }
}
