package a_ahackerrank.java_basics;

import java.awt.image.AreaAveragingScaleFilter;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class HourGlass {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
            try {
                arr.add(
                        Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                                .map(Integer::parseInt)
                                .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int rowCount = 0;
        int colCount = 0;
        ArrayList<Integer> sumList = new ArrayList<>();
        while (rowCount < 4) {
            int sum = 0;
            int glassCount = 0;
            for (int row = rowCount; row < rowCount + 3; row++) {
                for (int col = colCount; col < colCount + 3; col++) {
                    if (glassCount == 3 || glassCount == 5) {
                        // System.out.print("  ");
                    } else {
                        //System.out.print(arr.get(row).get(col) + " ");
                        sum += arr.get(row).get(col);
                    }
                    glassCount++;
                }
                //System.out.println();
            }
            sumList.add(sum);
            colCount++;
            if (colCount == 4) {
                colCount = 0;
                rowCount++;
            }
            //System.out.println("Sum : " + sum);
            //System.out.println();
        }
        Collections.sort(sumList);
        System.out.println(sumList.get(sumList.size() - 1));
        bufferedReader.close();
    }
}
