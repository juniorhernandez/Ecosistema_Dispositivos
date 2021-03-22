package practica.pkg1;

import java.io.*;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author Junior
 */
public class Dat {

    private Object LOG;

    public void escribir1(String nombre) {
        Scanner entradaC = new Scanner(System.in);
        File archivo;
        FileWriter escribir = null;
        PrintWriter linea;

        archivo = new File("Computadora.csv");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos de la Computadora");
                System.out.println("Ingrese el correo");
                correo = entradaC.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaC.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaC.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo:" + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }
        } else {
            try {
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos de la Computadora");
                System.out.println("Ingrese el correo");
                correo = entradaC.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaC.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaC.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }

        }

    }

    public void escribir2(String nombre) {
        Scanner entradaT = new Scanner(System.in);
        File archivo;
        FileWriter escribir;
        PrintWriter linea;

        archivo = new File("Tablet.csv");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos de la Tablet");
                System.out.println("Ingrese el correo");
                correo = entradaT.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaT.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaT.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }
        } else {
            try {
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos de la Tablet");
                System.out.println("Ingrese el correo");
                correo = entradaT.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaT.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaT.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }

        }

    }

    public void escribir3(String nombre) {
        Scanner entradaSM = new Scanner(System.in);
        File archivo;
        FileWriter escribir;
        PrintWriter linea;

        archivo = new File("SmartWacht.csv");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos del SmartWacht");
                System.out.println("Ingrese el correo");
                correo = entradaSM.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaSM.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaSM.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }
        } else {
            try {
                String correo;
                String nombreDispositivo;
                String visible;
                String encendido;
                String apagado;
                System.out.println("Datos del SmartWacht");
                System.out.println("Ingrese el correo");
                correo = entradaSM.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaSM.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaSM.next();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");

                linea.close();
                escribir.close();

            } catch (IOException e) {

            }

        }

    }

    public void escribir4(String nombre) {
        Scanner entradaSMP = new Scanner(System.in);
        File archivo;
        FileWriter escribir;
        PrintWriter linea;

        archivo = new File("SmartPhone.csv");

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                String correo;
                String nombreDispositivo;
                String visible;
                int telefono;
                String encendido;
                String apagado;
                System.out.println("Datos del SmarPhone");
                System.out.println("Ingrese el correo");
                correo = entradaSMP.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaSMP.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaSMP.next();
                System.out.println("Ingrese el numero de telefono");
                telefono = entradaSMP.nextInt();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + telefono + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nTelefono: " + telefono + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");
                linea.close();
                escribir.close();

            } catch (IOException e) {

            }
        } else {
            try {
                String correo;
                String nombreDispositivo;
                String visible;
                int telefono;
                String encendido;
                String apagado;
                System.out.println("Datos del SmartPhone");
                System.out.println("Ingrese el correo");
                correo = entradaSMP.next();
                System.out.println("Ingrese nombre del dispositivo");
                nombreDispositivo = entradaSMP.next();
                System.out.println("Ingrese dispositivo visible (si o no)");
                visible = entradaSMP.next();
                System.out.println("Ingrese el numero de telefono");
                telefono = entradaSMP.nextInt();

                escribir = new FileWriter(archivo, true);
                linea = new PrintWriter(escribir);

                linea.println(correo + "," + nombreDispositivo + "," + visible + "," + telefono + "," + "encendido");
                System.out.println("Correo: " + correo + "\nNombre de Dispositivo: " + nombreDispositivo + "\nDispositivo activo: " + visible + "\nTelefono: " + telefono + "\nDispositivo: " + "encendido");
                System.out.println("Nota: El dispositivo sera encendido por defecto");

                linea.close();
                escribir.close();

            } catch (IOException e) {

            }

        }

    }

    public void accionDispo1(String nombre) {
        Scanner entradad1 = new Scanner(System.in);
        System.out.println("Tomar Fotografia");
    }

    public void accionDispo2(String nombre) {
        Scanner entradad2 = new Scanner(System.in);
        System.out.println("Copiar texto");
    }

    public void accionExterna1(String nombre) {
        Scanner entradae3 = new Scanner(System.in);
        System.out.println("Mensaje");
    }

    public void accionExterna2(String nombre) {
        Scanner entradae2 = new Scanner(System.in);
        System.out.println("Notificaciones");
    }

    public void accionDispo3(String nombre) {
        Scanner entradad3 = new Scanner(System.in);
        System.out.println("Compatir Documentos");
    }

    public void accionDispo4(String nombre) {
        Scanner entradad4 = new Scanner(System.in);
        System.out.println("Conexion auriculares");

    }

    public void accionExterna3(String nombre) {
        Scanner entradae3 = new Scanner(System.in);
        System.out.println("Llamada telefonica");

    }

    public void accionDispo5(String nombre) {
        Scanner entradad5 = new Scanner(System.in);
        System.out.println("Reproducir Musica");

    }

    public void accionDispo6(String nombre) {
        Scanner entradad6 = new Scanner(System.in);
        System.out.println("Pegar Texto");

    }

    public void leer1(String nombre) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("C:\\Users\\Junior\\Desktop\\Proyecto Programacion\\Practica#1\\Computadora.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void leer2(String nombre) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("C:\\Users\\Junior\\Desktop\\Proyecto Programacion\\Practica#1\\Tablet.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void leer3(String nombre) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("C:\\Users\\Junior\\Desktop\\Proyecto Programacion\\Practica#1\\SmartWacht.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void leer4(String nombre) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {

            archivo = new File("C:\\Users\\Junior\\Desktop\\Proyecto Programacion\\Practica#1\\SmartPhone.csv");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);

            String linea;
            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void adminC1(String nombre) {
        Scanner entradaC1 = new Scanner(System.in);
        System.out.println("editar correo electronico");
    }

    public void adminC2(String nombre) {
        Scanner entradaC2 = new Scanner(System.in);
        System.out.println("editar nombre de dispositivo");
    }

    public void adminC3(String nombre) {
        Scanner entradaC3 = new Scanner(System.in);
        System.out.println("apagar visibilidad del dispositivo");

    }

    public void adminC4(String nombre) {
        Scanner entradaC4 = new Scanner(System.in);
        System.out.println("apagar dispositivo");

    }

    public void adminT1(String nombre) {
        Scanner entradaT1 = new Scanner(System.in);
        System.out.println("editar correo electronico");
    }

    public void adminT2(String nombre) {
        Scanner entradaT2 = new Scanner(System.in);
        System.out.println("editar nombre de dispositivo");
    }

    public void adminT3(String nombre) {
        Scanner entradat3 = new Scanner(System.in);
        System.out.println("apagar visibilidad del dispositivo");

    }

    public void adminT4(String nombre) {
        Scanner entradat4 = new Scanner(System.in);
        System.out.println("apagar dispositivo");

    }

    public void adminS1(String nombre) {
        Scanner entradaS1 = new Scanner(System.in);
        System.out.println("editar correo electronico");
    }

    public void adminS2(String nombre) {
        Scanner entradaS2 = new Scanner(System.in);
        System.out.println("editar nombre de dispositivo");
    }

    public void adminS3(String nombre) {
        Scanner entradaS3 = new Scanner(System.in);
        System.out.println("apagar visibilidad del dispositivo");

    }

    public void adminS4(String nombre) {
        Scanner entradas4 = new Scanner(System.in);
        System.out.println("apagar dispositivo");

    }

    public void adminSm1(String nombre) {
        Scanner entradaSm1 = new Scanner(System.in);
        System.out.println("editar correo Electronico");
    }

    public void adminSm2(String nombre) {
        Scanner entradaSm2 = new Scanner(System.in);
        System.out.println("editar nombre del dispositivo");
    }

    public void adminSm3(String nombre) {
        Scanner entradaSm3 = new Scanner(System.in);
        System.out.println("apagar visibilidad de dispositivo");

    }

    public void adminSm4(String nombre) {
        Scanner entradaSm4 = new Scanner(System.in);
        System.out.println("apagar dispositivo");

    }

    public void adminA1(String nombre) {
        Scanner entradaA1 = new Scanner(System.in);
        System.out.println("Editar nombre del dispositivo");
    }

    public void adminA2(String nombre) {
        Scanner entradaA2 = new Scanner(System.in);
        System.out.println("eliminar dispositivo sincronizado");

    }

    public void adminA3(String nombre) {
        Scanner entradaA3 = new Scanner(System.in);
        System.out.println("apagar dispositivo");

    }

    public void Logs(String nombre) {

        
    }

}
