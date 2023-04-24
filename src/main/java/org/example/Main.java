package org.example;

import Servicio.MenuServicio;

public class Main {
    public static void main(String[] args) {


            MenuServicio menuservicio = new MenuServicio();
            try {
                menuservicio.Menu();

            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }
    }




