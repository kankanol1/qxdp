package qxdp.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        String str = "123456789";
        char[] chars = str.toCharArray();
//        System.out.println(chars);
//        System.out.println(reverseStr(0,chars));
//        System.out.println(fun(5,3));
        System.out.println(generate(5));

    }
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> a=new ArrayList<List<Integer>>();

        if(numRows<=0){
            return a;
        }
        a.add(new ArrayList<>());
        a.get(0).add(1);


        for(int i=1;i<numRows;i++ ){
            List<Integer> b=new ArrayList<>();
            List<Integer> a0=a.get(i-1);
            b.add(1);

            for(int j=1;j<i;j++){
                b.add(a0.get(j-1)+a0.get(j));
            }
            b.add(1);
            a.add(b);
        }

        return a;
    }

    public static Integer fun(int i,int j){
        if(j==1|i==j){
            return 1;
        }
        return fun(i-1,j-1)+fun(i-1,j);
    }

    public static char[] reverseStr(int index,char[] str){
        if(str==null | index>=str.length/2){
            return str;
        }
        char a= str[index];
        str[index]= str[str.length-1-index];
        str[str.length-1-index]=a;
        return reverseStr(index+1,str);

    }

    public static void printReverse(int index,char[] str){
        if(str==null | index>=str.length){
            return;
        }
        printReverse(index+1,str);
        System.out.println(str[index]);
    }
}
