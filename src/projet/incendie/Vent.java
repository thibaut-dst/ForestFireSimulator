/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projet.incendie;

import java.util.Arrays;

/**
 *
 * @author thibautdesauty
 */
public class Vent {

    private String direction;
    private int force;
    private double matriceVent[][];

    public String getDirection() {
        return direction;
    }

    public int getForce() {
        return force;
    }

    public Vent(String direction, int force) {
        this.direction = direction;
        this.force = force;

        if ("Nord".equals(direction)) {

            switch (force) {
                case 0: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.1, 0.1, 0, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0.01, 0.3, 0, 0.3, 0.01, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0, 0.01, 0.01, 0.01, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 1: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.2, 0.1, 0, 0},
                        {0, 0, 0.3, 0, 0.3, 0, 0},
                        {0, 0, 0.3, 0.4, 0.3, 0, 0},
                        {0, 0, 0.02, 0.05, 0.02, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 2: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.05, 0.1, 0.05, 0, 0},
                        {0, 0, 0.25, 0, 0.25, 0, 0},
                        {0, 0, 0.4, 0.5, 0.4, 0, 0},
                        {0, 0, 0.05, 0.1, 0.05, 0, 0},
                        {0, 0, 0, 0.01, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                default: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0, 0.1, 0, 0},
                        {0, 0, 0.5, 0.7, 0.5, 0, 0},
                        {0, 0, 0.2, 0.3, 0.2, 0, 0},
                        {0, 0, 0.01, 0.05, 0.01, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
            }
        }
        if ("Sud".equals(direction)) {

            switch (force) {
                case 0: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.1, 0.1, 0, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0.01, 0.3, 0, 0.3, 0.01, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0, 0.01, 0.01, 0.01, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 1: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.02, 0.05, 0.02, 0, 0},
                        {0, 0, 0.3, 0.4, 0.3, 0, 0},
                        {0, 0, 0.3, 0, 0.3, 0, 0},
                        {0, 0, 0.1, 0.2, 0.1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 2: {
                    double mat[][] = {
                        {0, 0, 0, 0.01, 0, 0, 0},
                        {0, 0, 0.05, 0.1, 0.05, 0, 0},
                        {0, 0, 0.4, 0.5, 0.4, 0, 0},
                        {0, 0, 0.25, 0, 0.25, 0, 0},
                        {0, 0, 0.05, 0.1, 0.05, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                default: {
                    double mat[][] = {
                        {0, 0, 0.01, 0.05, 0.01, 0, 0},
                        {0, 0, 0.2, 0.3, 0.2, 0, 0},
                        {0, 0, 0.5, 0.7, 0.5, 0, 0},
                        {0, 0, 0.1, 0, 0.1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
            }
        }
        if ("Est".equals(direction)) {

            switch (force) {
                case 0: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.1, 0.1, 0, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0.01, 0.3, 0, 0.3, 0.01, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0, 0.01, 0.01, 0.01, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 1: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0.02, 0.3, 0.3, 0.1, 0, 0},
                        {0, 0.05, 0.4, 0, 0.2, 0, 0},
                        {0, 0.02, 0.3, 0.3, 0.1, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 2: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0.05, 0.4, 0.25, 0.5, 0, 0},
                        {0.01, 0.1, 0.5, 0, 0.1, 0, 0},
                        {0, 0.05, 0.4, 0.25, 0.5, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                default: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0.01, 0.2, 0.5, 0.1, 0, 0, 0},
                        {0.05, 0.3, 0.7, 0, 0, 0, 0},
                        {0.01, 0.2, 0.5, 0.1, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
            }
        }
        if ("Ouest".equals(direction)) {

            switch (force) {
                case 0: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.1, 0.1, 0, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0.01, 0.3, 0, 0.3, 0.01, 0},
                        {0, 0.01, 0.2, 0.3, 0.2, 0.01, 0},
                        {0, 0, 0.01, 0.01, 0.01, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 1: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.1, 0.3, 0.3, 0.02, 0},
                        {0, 0, 0.2, 0, 0.4, 0.05, 0},
                        {0, 0, 0.1, 0.3, 0.3, 0.02, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                case 2: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0.05, 0.25, 0.4, 0.05, 0},
                        {0, 0, 0.1, 0, 0.5, 0.1, 0.01},
                        {0, 0, 0.05, 0.25, 0.4, 0.05, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
                default: {
                    double mat[][] = {
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0.1, 0.5, 0.2, 0.01},
                        {0, 0, 0, 0, 0.7, 0.3, 0.5},
                        {0, 0, 0, 0.1, 0.5, 0.2, 0.01},
                        {0, 0, 0, 0, 0, 0, 0},
                        {0, 0, 0, 0, 0, 0, 0}
                    };
                    matriceVent = Arrays.copyOf(mat, mat.length);
                    break;
                }
            }
        }
    }

    public double[][] getMatriceVent() {
        return matriceVent;
    }

}
