public class Main {
    public static void main(String[] args) {
        char[] array = {'A', 'B', 'C', 'D','E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R','S', 'T',
        'U', 'V', 'W', 'X', 'Y', 'Z'};
        int a = 0;
        for(char ch : array){

        }
        public void sort(char[] arr){
            int n = array.length;
            for (int i = 0; i < n; i++){
                for(int j = 0; j < i; j++) {
                    if (arr[j] > arr[j + 1]){
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }
    }
}