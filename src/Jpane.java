
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author mohammadHossein
 */
public class Jpane {

    public static void main(String[] args) {
        String str;
        str = JOptionPane.showInputDialog(null,"لطفا یک رشته وارد نمایید.");//جهت دریافت یک مقدار از ورودی
        
        JOptionPane.showMessageDialog(null, str, "عنوان فرم", JOptionPane.INFORMATION_MESSAGE);//جهت نمایش یک داده در خروجی به صورت گرافیکی
    }
}
