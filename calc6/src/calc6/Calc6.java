package calc6;
import java.util.Scanner;

public class Calc6{
    public static void main (String args[])
    {   
        System.out.println("�����������");
        System.out.println("����������� ����� ��������� ����� ��������, ��� ��������, ���������, ��������� � �������");
        System.out.println("������� ���������:");
        while(true){
        String op;
        Scanner scanner=new Scanner(System.in, "utf-8");
        op=scanner.nextLine();
        calc Calc=new calc();
        String num=Calc.get(op);
        System.out.println("���������: "+ num);
        System.out.println("��� ��������?y/n");
        op=scanner.nextLine();
        if(op.equals("n"))
        break;
    }
        
}
}


