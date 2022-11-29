import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[]{6, 6, 3, 4, 5, 1, 1, 1, 623, 325, 8, 8, 8, 8, 8, 8,};
        float counter;
        boolean isDuplicate;
        Iterator<Float> iter;
        HashMap<Float, Integer> map = new HashMap<>();
        ArrayList<Integer> uniqueValues = new ArrayList<>();
        ArrayList<Float> sequence = new ArrayList<>();
        uniqueValues.add(array[0]);


        for(int i = 0; i<array.length; i++){
            isDuplicate = false;
            for(int j = 0; j<uniqueValues.size(); j++){
                if(array[i] == uniqueValues.get(j)){
                    isDuplicate = true;
                }

            }
            if(!isDuplicate) {
                uniqueValues.add(array[i]);
            }
        }

        for (int j = 0; j<uniqueValues.size(); j++){
            counter = 0;
            for(int i = 0; i<array.length; i++){
                if(array[i]==uniqueValues.get(j)){
                    counter++;
                }
            }
            iter = map.keySet().iterator();
            while (iter.hasNext()){
                if(iter.next() == counter){
                    counter -= 0.000001;
                }
            }
            map.put(counter, uniqueValues.get(j));
        }
        iter = map.keySet().iterator();

        while (iter.hasNext()){
            sequence.add(iter.next());
        }
        Collections.sort(sequence);


        for (int j = sequence.size()-1; j>=0;j--) {
            for(int i = 0;i<Math.round(sequence.get(j));i++){
                System.out.print(map.get( + sequence.get(j))+" ");
            }
        }
    }
}