package IO.IO;

import java.util.Scanner;

public class Main {

    private static void fileInputStream() throws Exception{

        FileInputStream fileInputStream = new FileInputStream();
        fileInputStream.isMarkSupported();
        fileInputStream.available();
        fileInputStream.readSingleByte();
        fileInputStream.readUsingByteArray();
        fileInputStream.readFullFileUsingByteArray();
        fileInputStream.readUsingByteArrayOffset();

    }

    private static void fileOutputStream() throws Exception {

        String filePath = "/Users/arun-zt455/GitHub/JAVA/IO/sampleOutput.txt";

        FileOutputStream fileOutputStream = new FileOutputStream(filePath);

        fileOutputStream.writeSingleByte();
        fileOutputStream.close();

        fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.writeUsingByteArray();
        fileOutputStream.close();

        fileOutputStream = new FileOutputStream(filePath);
        fileOutputStream.writeUsingByteArrayOffset();
        fileOutputStream.close();

    }

    private static void byteArrayInputStream() throws Exception {

        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        byteArrayInputStream.isMarkSupported();
        byteArrayInputStream.available();
        byteArrayInputStream.readSingleByte();
        byteArrayInputStream.readUsingByteArray();
        byteArrayInputStream.readFullFileUsingByteArray();
        byteArrayInputStream.readUsingByteArrayOffset();

    }

    private static void  byteArrayOutputStream() throws Exception {

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        byteArrayOutputStream.writeSingeByte();
        byteArrayOutputStream.close();

        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeUsingByteArray();
        byteArrayOutputStream.close();

        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeUsingByteArrayOffset();
        byteArrayOutputStream.close();

        byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.writeTo();
        byteArrayOutputStream.close();

    }

    private static void bufferedInputStream() throws Exception {

        BufferedInputStream bufferedInputStream = new BufferedInputStream();
        bufferedInputStream.isMarkSupported();
        bufferedInputStream.available();
        bufferedInputStream.readSingleByte();
        bufferedInputStream.readUsingByteArray();
        bufferedInputStream.readFullFileUsingByteArray();
        bufferedInputStream.readUsingByteArrayOffset();

    }

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        boolean doContinue = false;
        do{
            System.out.println("Enter 1-Read, 2-Write");
            int actionType = scanner.nextInt();
            if(actionType == 1){
                System.out.println("Enter 1-fileInputStream, 2-byteArrayInputStream, 3-bufferedInputStream");
                int readType = scanner.nextInt();
                switch (readType){
                    case 1:
                        fileInputStream();
                        break;

                    case 2:
                        byteArrayInputStream();
                        break;

                    case 3:
                        bufferedInputStream();
                        break;
                }
            }else if (actionType == 2){
                System.out.println("Enter 1-fileOutputStream, 2-byteArrayOutputStream");
                int writeType = scanner.nextInt();
                switch (writeType){
                    case 1:
                        fileOutputStream();
                        break;

                    case 2:
                        byteArrayOutputStream();
                        break;
                }
            }
            System.out.println("Enter 1-Continue, 2-Exit");
            doContinue = scanner.nextInt() == 1 ? true : false;
        }while (doContinue);

    }

}
