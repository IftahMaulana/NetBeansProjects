/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package me.iftah;

import me.iftah.controller.MahasiswaController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * @author User
 */
@SpringBootApplication
public class Pertemuan5_50421630 implements CommandLineRunner{
    
    @Autowired
    private MahasiswaController mhsController;
    
    public static void main(String[] args) {
        SpringApplication.run(Pertemuan5_50421630.class, args);
    }
    
    @Override
    public void run(String... args) throws Exception {
	mhsController.tampilkanMenu();
    }
}
