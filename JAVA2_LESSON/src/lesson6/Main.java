/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson6;

/**
 *
 * @author admin
 */
public class Main {
    public static void main(String[] args) {
        ShareData shareData = new ShareData();
        
        ThreadOne t1 = new ThreadOne(shareData);
        ThreadTwo t2 = new ThreadTwo(shareData);
        
        t2.start();
        t1.start();
        
    }
}
