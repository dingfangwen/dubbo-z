package com.need.xulie;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * <p>TODO</p>
 * <p/>
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author afi on on 2016/11/25.
 * @version 1.0
 * @since 1.0
 */
public class Simulator {
    public static void main(String[] args) {
        new Simulator().go();
    }

    private void go(){
        Student student = new Student(new Book(2011),"kevin");

        try {
            ObjectOutputStream out  = new ObjectOutputStream(new FileOutputStream("seria"));
            out.writeObject(student); //
            System.out.println("object has been written..");
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("seria"));
            Student studentRead = (Student) in.readObject();
            System.out.println("object read here:");
            System.out.println(studentRead);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}