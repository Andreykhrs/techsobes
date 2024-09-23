//Дан массив строк, необходимо удалить из него все дубли,
// оставшиеся строки объединить в одну в порядке следования в массиве.

import java.util.Arrays;

public static String arrayWithOutDuples (String ... arr) {
    return Arrays.Stream(arr)
            .distinct()
            .collect(collectors.joining());

}

