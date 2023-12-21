public class array {
                public static void main(String[] args) {
                    int[] val = {10,5,15,7,20};
                    int total = 0;
                    int max = val[0];
                    int min = val[0];

                    for (int i = 0 ; i<val.length;i++) {
                        total = total + val[i];
                    }
                        System.out.println("Sum: "+ total);
                        double average = (double) total / val.length;
                        System.out.println("Average: "+ average);
                        for (int j =0;j<val.length;j++){
                        if (val[j] > max) {
                            max = val[j];
                        }
                        if (val[j] < min) {
                        min = val[j];
                        }
                        }
                            System.out.println("Max is " + max);  
                            System.out.println("Min is " + min);  
                    }
                }