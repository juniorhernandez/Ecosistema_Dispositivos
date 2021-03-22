package practica.pkg1;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author Junior
 */
public class Practica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Dat d = new Dat();
        Dat d2 = new Dat();
        Dat d3 = new Dat();
        Dat d4 = new Dat();
        Dat d5 = new Dat();
        Dat accionExterna1 = new Dat();
        Dat accionExterna2 = new Dat();
        Dat accionExterna3 = new Dat();
        Dat accionDispo1 = new Dat();
        Dat accionDispo2 = new Dat();
        Dat accionDispo3 = new Dat();
        Dat accionDispo4 = new Dat();
        Dat accionDispo5 = new Dat();
        Dat accionDispo6 = new Dat();
        Dat leer1 = new Dat();
        Dat leer2 = new Dat();
        Dat leer3 = new Dat();
        Dat leer4 = new Dat();
        Dat adminC1 = new Dat();
        Dat adminC2 = new Dat();
        Dat adminC3 = new Dat();
        Dat adminC4 = new Dat();
        Dat adminT1 = new Dat();
        Dat adminT2 = new Dat();
        Dat adminT3 = new Dat();
        Dat adminT4 = new Dat();
        Dat adminS1 = new Dat();
        Dat adminS2 = new Dat();
        Dat adminS3 = new Dat();
        Dat adminS4 = new Dat();
        Dat adminSm1 = new Dat();
        Dat adminSm2 = new Dat();
        Dat adminSm3 = new Dat();
        Dat adminSm4 = new Dat();
        Dat adminA1 = new Dat();
        Dat adminA2 = new Dat();
        Dat adminA3 = new Dat();
        Dat Logs = new Dat();

        int opcion;

        do {

            Scanner Menu = new Scanner(System.in);
            System.out.println("--------------------Bienvenidos ala APP de Dispositivos-------------------"
                    + "\n Seleccione la Opcion que desea realizar"
                    + "\n 1. Crear dispositivos"
                    + "\n 2. Administrador de dispositivos"
                    + "\n 3. Acciones con dispositivos"
                    + "\n 4. Acciones externas con dispositivos"
                    + "\n 5. cargas Masivas"
                    + "\n 6. Logs"
                    + "\n 7. Salir");
            opcion = Menu.nextInt();
            switch (opcion) {
                case 1: {
                    do {
                        System.out.println("-------------------- Agreagar dispositivos -------------------"
                                + "\n Agregue el dispositivo que desee"
                                + "\n 1. Computadora portatil "
                                + "\n 2. Tablet"
                                + "\n 3. SmartWatch"
                                + "\n 4. SmartPhone"
                                + "\n 5. Auriculares Inalambricos"
                                + "\n 6. Salir");
                        opcion = Menu.nextInt();
                        switch (opcion) {
                            case 1: {
                                d.escribir1("Computadoras.csv");
                            }
                            break;
                            case 2: {
                                d2.escribir2("Tablet.csv");

                            }
                            break;
                            case 3: {
                                d3.escribir3("SmartWatch.csv");

                            }
                            break;
                            case 4: {
                                d4.escribir4("SmartPhone.csv");

                            }
                            break;
                            case 5: {
                                do {

                                    System.out.println("--------------------Dispositivos-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Computadora"
                                            + "\n 2. Tablet"
                                            + "\n 3. SmartWacht"
                                            + "\n 4. SmartPhone"
                                            + "\n 5. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            System.out.println("Datos de computadora");
                                            leer1.leer1("Computadora");

                                        }
                                        break;
                                        case 2: {
                                            System.out.println("Datos de tablet");
                                            leer2.leer2("Tablet");

                                        }
                                        break;
                                        case 3: {
                                            System.out.println("Datos de SmartWhact");
                                            leer3.leer3("SmartWhach");

                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Datos de SmartPhone");
                                            leer4.leer4("SmartPhone");

                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Saliendo de la configuracion de auriculares");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 5");
                                    }

                                } while (opcion != 5);

                            }
                            break;
                            case 6: {
                                System.out.println("Saliendo de la configuracion");

                            }
                            break;
                            default:
                                System.out.println("Las opciones es entre 1 a 6 ");
                        }

                    } while (opcion != 6);

                }
                break;
                case 2: {
                    do {
                        System.out.println("--------------------Bienvenidos al administrador de Dispositivos-------------------"
                                + "\n Agregue el dispositivo que desee"
                                + "\n 1. Computadora portatil "
                                + "\n 2. Tablet"
                                + "\n 3. SmartWatch"
                                + "\n 4. SmartPhone"
                                + "\n 5. Auriculares Inalambricos"
                                + "\n 6. Salir");
                        opcion = Menu.nextInt();
                        switch (opcion) {
                            case 1: {
                                do {

                                    System.out.println("--------------------Bienvenidos Administrtacion de Computadora-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Editar correo Electronico"
                                            + "\n 2. Editar nombre del dispositivo"
                                            + "\n 3. Apagar Visibilidad del dispositivo"
                                            + "\n 4. Apagar dispositivo"
                                            + "\n 5. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            adminC1.adminC1("Editar correo electronico");

                                        }
                                        break;
                                        case 2: {
                                            adminC2.adminC2("Editar nombre del dispositivo");
                                        }
                                        break;
                                        case 3: {
                                            adminC3.adminC3("Apagar Visibilidad del dispositivo");

                                        }
                                        break;
                                        case 4: {
                                            adminC4.adminC4("Apagar Visibilidad del dispositivo");
                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Saliendo de la administracion del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones de 1 a 5");

                                    }
                                } while (opcion != 5);

                            }
                            break;
                            case 2: {
                                do {

                                    System.out.println("--------------------Bienvenidos ala Administracion de Tablet-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Editar correo Electronico"
                                            + "\n 2. Editar nombre del dispositivo"
                                            + "\n 3. Apagar Visibilidad del dispositivo"
                                            + "\n 4. Apagar dispositivo"
                                            + "\n 5. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            adminT1.adminT1("Editar correo Electronico");

                                        }
                                        break;
                                        case 2: {
                                            adminT2.adminT2("Editar nombre del dispositivo");
                                        }
                                        break;
                                        case 3: {
                                            adminT3.adminT3("Apagar Visibilidad del dispositivo");

                                        }
                                        break;
                                        case 4: {
                                            adminT4.adminT4("Apagar dispositivo");

                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Saliendo de la administracion del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones de 1 a 5");

                                    }
                                } while (opcion != 5);

                            }
                            break;
                            case 3: {
                                do {

                                    System.out.println("--------------------Bienvenidos ala Administracion de SmartWhacht-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Editar correo Electronico"
                                            + "\n 2. Editar nombre del dispositivo"
                                            + "\n 3. Apagar Visibilidad del dispositivo"
                                            + "\n 4. Apagar dispositivo"
                                            + "\n 5. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            adminS1.adminS1("Editar correo Electronico");
                                        }
                                        break;
                                        case 2: {
                                            adminS2.adminS2("Editar nombre del dispositivo");
                                        }
                                        break;
                                        case 3: {
                                            adminS3.adminS3("Apagar Visibilidad del dispositivo");
                                        }
                                        break;
                                        case 4: {
                                            adminS4.adminS4("Apagar dispositivo");

                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Saliendo de la administracion del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones de 1 a 5");

                                    }
                                } while (opcion != 5);
                            }
                            break;
                            case 4: {
                                do {

                                    System.out.println("--------------------Bienvenidos ala Administracion de SmartPhone-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Editar correo Electronico"
                                            + "\n 2. Editar nombre del dispositivo"
                                            + "\n 3. Apagar Visibilidad del dispositivo"
                                            + "\n 4. Apagar dispositivo"
                                            + "\n 5. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            adminSm1.adminSm1("Editar correo Electronico");

                                        }
                                        break;
                                        case 2: {
                                            adminSm2.adminSm2("Editar nombre del dispositivo");

                                        }
                                        break;
                                        case 3: {
                                            adminSm3.adminSm3("Apagar Visibilidad del dispositivo");

                                        }
                                        break;
                                        case 4: {
                                            adminSm4.adminS4("Apagar dispositivo");
                                        }
                                        break;
                                        case 5: {
                                            System.out.println("Saliendo de la administracion del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones de 1 a 5");

                                    }
                                } while (opcion != 5);

                            }
                            break;
                            case 5: {
                                do {

                                    System.out.println("--------------------Bienvenidos ala Administracion de Auriculares-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Editar nombre de dispositivo"
                                            + "\n 2. Eliminar dispositivo sincronizado"
                                            + "\n 3. Apagar dispositivo"
                                            + "\n 4. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            adminA1.adminA1("Editar nombre de dispositivo");

                                        }
                                        break;
                                        case 2: {
                                            adminA2.adminA2("Eliminar dispositivo sincronizado");

                                        }
                                        break;
                                        case 3: {
                                            adminA3.adminA3("Apagar dispositivo");

                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Saliendo de la administracion del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones de 1 a 4");

                                    }
                                } while (opcion != 4);

                            }
                            break;
                            default:
                                System.out.println("Opciones 1 a 6");

                        }

                    } while (opcion != 6);
                }
                break;
                case 3: {
                    do {
                        System.out.println("--------------------Bienvenidos alas acciones de los Dispositivos-------------------"
                                + "\n Agregue el dispositivo que desee"
                                + "\n 1. Computadora portatil "
                                + "\n 2. Tablet"
                                + "\n 3. SmartWatch"
                                + "\n 4. SmartPhone"
                                + "\n 5. Salir");
                        opcion = Menu.nextInt();
                        switch (opcion) {
                            case 1: {
                                do {
                                    System.out.println("--------------------Acciones de Dispositivo-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Tomar Fotografia"
                                            + "\n 2. Copiar texto"
                                            + "\n 3. pegar texto"
                                            + "\n 4. Compartir Documentos"
                                            + "\n 5. Conexion Auriculares"
                                            + "\n 6. Reproducir Musica"
                                            + "\n 7. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionDispo1.accionDispo1("Tomar fotografia");

                                        }
                                        break;
                                        case 2: {
                                            accionDispo2.accionDispo2("Copiar texto");

                                        }
                                        break;
                                        case 3: {
                                            accionDispo6.accionDispo6("Pegar texto");

                                        }
                                        break;
                                        case 4: {
                                            accionDispo3.accionDispo3("Compartir Documentos");

                                        }
                                        break;
                                        case 5: {
                                            accionDispo4.accionDispo4("Conexion Auriculares");
                                        }
                                        break;
                                        case 6: {
                                            accionDispo5.accionDispo5("Reproducir Musica");

                                        }
                                        break;
                                        case 7: {
                                            System.out.println("Saliendode las Acciones del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 7");
                                    }
                                } while (opcion != 7);

                            }
                            break;
                            case 2: {
                                do {
                                    System.out.println("--------------------Acciones de Dispositivo-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Tomar Fotografia"
                                            + "\n 2. Copiar texto"
                                            + "\n 3. pegar texto"
                                            + "\n 4. Compartir Documentos"
                                            + "\n 5. Conexion Auriculares"
                                            + "\n 6. Reproducir Musica"
                                            + "\n 7. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionDispo1.accionDispo1("Tomar fotografia");

                                        }
                                        break;
                                        case 2: {
                                            accionDispo2.accionDispo2("Copiar texto");

                                        }
                                        break;
                                        case 3: {
                                            accionDispo6.accionDispo6("Pegar texto");

                                        }
                                        break;
                                        case 4: {
                                            accionDispo3.accionDispo3("Compartir Documentos");

                                        }
                                        break;
                                        case 5: {
                                            accionDispo4.accionDispo4("Conexion Auriculares");
                                        }
                                        break;
                                        case 6: {
                                            accionDispo5.accionDispo5("Reproducir Musica");

                                        }
                                        break;
                                        case 7: {
                                            System.out.println("Saliendode las Acciones del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 7");

                                    }
                                } while (opcion != 7);

                            }
                            break;
                            case 3: {
                                do {
                                    System.out.println("--------------------Acciones de Dispositivo-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Tomar Fotografia"
                                            + "\n 2. Conexion Auriculares"
                                            + "\n 3. Reproducir Musica"
                                            + "\n 4. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionDispo1.accionDispo1("Tomar fotografia");

                                        }
                                        break;

                                        case 2: {
                                            accionDispo4.accionDispo4("Conexion Auriculares");
                                        }
                                        break;
                                        case 3: {
                                            accionDispo5.accionDispo5("Reproducir Musica");

                                        }
                                        break;
                                        case 4: {
                                            System.out.println("Saliendode las Acciones del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 4");
                                    }
                                } while (opcion != 4);

                            }
                            case 4: {
                                do {
                                    System.out.println("--------------------Acciones de Dispositivo-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Tomar Fotografia"
                                            + "\n 2. Copiar texto"
                                            + "\n 3. pegar texto"
                                            + "\n 4. Compartir Documentos"
                                            + "\n 5. Conexion Auriculares"
                                            + "\n 6. Reproducir Musica"
                                            + "\n 7. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionDispo1.accionDispo1("Tomar fotografia");

                                        }
                                        break;
                                        case 2: {
                                            accionDispo2.accionDispo2("Copiar texto");

                                        }
                                        break;
                                        case 3: {
                                            accionDispo6.accionDispo6("Pegar texto");

                                        }
                                        break;
                                        case 4: {
                                            accionDispo3.accionDispo3("Compartir Documentos");

                                        }
                                        break;
                                        case 5: {
                                            accionDispo4.accionDispo4("Conexion Auriculares");
                                        }
                                        break;
                                        case 6: {
                                            accionDispo5.accionDispo5("Reproducir Musica");

                                        }
                                        break;
                                        case 7: {
                                            System.out.println("Saliendode las Acciones del dispositivo");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 7");

                                    }
                                } while (opcion != 7);

                            }
                            break;
                            case 5: {
                                System.out.println("Saliendo de la Configuracion de las acciones de los dispositivos");

                            }
                            break;
                            default:
                                System.out.println("Opciones 1 a 5");
                        }
                    } while (opcion != 5);

                }
                break;
                case 4: {
                    do {
                        System.out.println("--------------------Bienvenidos alas acciones externas de los Dispositivos-------------------"
                                + "\n Agregue el dispositivo que desee"
                                + "\n 1. Computadora portatil "
                                + "\n 2. Tablet"
                                + "\n 3. SmartWatch"
                                + "\n 4. SmartPhone"
                                + "\n 5. Salir");
                        opcion = Menu.nextInt();
                        switch (opcion) {
                            case 1: {
                                do {
                                    System.out.println("--------------------Acciones Externas de Computadora-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Mensajes"
                                            + "\n 2. Notificaciones"
                                            + "\n 3. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionExterna1.accionExterna1("Mensaje");
                                        }
                                        break;
                                        case 2: {
                                            accionExterna2.accionExterna2("Notificaciones");
                                        }
                                        break;
                                        case 3: {
                                            System.out.println("saliendo de las Acciones Externas de Computadora");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 3");
                                    }
                                } while (opcion != 3);

                            }
                            break;
                            case 2: {
                                do {
                                    System.out.println("--------------------Acciones Externas de Tablet-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Mensajes"
                                            + "\n 2. Notificaciones"
                                            + "\n 3. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionExterna1.accionExterna1("Mensaje");
                                        }
                                        break;
                                        case 2: {
                                            accionExterna2.accionExterna2("Notificaciones");
                                        }
                                        break;
                                        case 3: {
                                            System.out.println("saliendo de las Acciones Externas de Tablet");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 3");
                                    }
                                } while (opcion != 3);

                            }
                            break;
                            case 3: {
                                do {
                                    System.out.println("--------------------Acciones Externas de SmartWhacht-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Notificaciones"
                                            + "\n 2. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionExterna2.accionExterna2("Notificaciones");
                                        }
                                        break;
                                        case 2: {
                                            System.out.println("saliendo de las Acciones Externas de SmarWhacht");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 2");
                                    }
                                } while (opcion != 2);

                            }
                            break;
                            case 4: {
                                do {
                                    System.out.println("--------------------Acciones Externas de SmartPhone-------------------"
                                            + "\n Seleccione la Opcion que desea realizar"
                                            + "\n 1. Mensajes"
                                            + "\n 2. Notificaciones"
                                            + "\n 3. Llamadas"
                                            + "\n 4. Salir");
                                    opcion = Menu.nextInt();
                                    switch (opcion) {
                                        case 1: {
                                            accionExterna1.accionExterna1("Mensaje");
                                        }
                                        break;
                                        case 2: {
                                            accionExterna2.accionExterna2("Notificaciones");
                                        }
                                        break;
                                        case 3: {
                                            accionExterna3.accionExterna3("Llamadas");
                                        }
                                        break;
                                        case 4: {
                                            System.out.println("saliendo de las Acciones Externas de SmartPhone");
                                        }
                                        break;
                                        default:
                                            System.out.println("Opciones 1 a 4");
                                    }
                                } while (opcion != 4);

                            }
                            break;
                            case 5: {
                                System.out.println("Saliendo de las Acciones externas");

                            }
                            break;
                            default:
                                System.out.println("Opciones 1 a 5");
                        }
                    } while (opcion != 5);

                }
                case 5: {
                    System.out.println("Datos Computadora");
                    leer1.leer1("Computadora");
                    System.out.println("Datos Tablet");
                    leer2.leer2("Tablet");
                    System.out.println("Datos SmartWhacht");
                    leer3.leer3("SmartWhacht");
                    System.out.println("Datos SmartPhone");
                    leer4.leer4("SmartPhone");

                }
                break;
                case 6: {
                    System.out.println("");
                    Logs.Logs("");
                }
                break;
                default:
                    System.out.println("Opciones 1 a 7");
            }
        } while (opcion != 7);

    }
}
