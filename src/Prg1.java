import java.util.*;
class Student1
{
    String name;
    int rno,m1,m2,m3,tot,maximum;
    double avg;

    Student1(String n,int roll,int mark1,int mark2,int mark3)
    {
        name=n;
        rno=roll;
        m1=mark1;
        m2=mark2;
        m3=mark3;
    }
    void calc()
    {
        tot=m1+m2+m3;
        avg=tot/3.0;
        if(m1>m2&&m1>m3)
            maximum=m1;
        else if(m2>m1&&m2>m3)
            maximum=m2;
        else
            maximum=m3;
    }
    void display()
    {
        System.out.println("RNO"+"  "+"NAME"+"  "+"TOTAL"+"  "+"AVERAGE"+"  "+"MAXIMUM");
        System.out.println(rno+"  "+name+"  "+tot+"  "+avg+"  "+maximum);
    }

}