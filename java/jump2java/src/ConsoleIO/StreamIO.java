package ConsoleIO;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StreamIO {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println(scanner.next());
        // nextLine, nextInt

//        InputStream in = System.in; // byte로 읽음, 아스키 코드 값을 리턴
//        InputStreamReader reader = new InputStreamReader(in);   // char
//        BufferedReader br = new BufferedReader(reader); // string
//
//        String a = br.readLine();
//        System.out.println(a);
//
////        char[] a = new char[3]; // byte 대신 char 배열 사용 할 수 있게됨
////        reader.read(a);
////        System.out.println(a);
////
//////        byte[] a = new byte[3];
//////        in.read(a);
//////
//////        System.out.println(a[0]);
//////        System.out.println(a[1]);
//////        System.out.println(a[2]);
////////        int a;
////////        a = in.read();
////////        System.out.println(a);
    }
}
