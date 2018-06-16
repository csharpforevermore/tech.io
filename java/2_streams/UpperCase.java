// { autofold
package streams;

import java.util.*;
import java.util.stream.*;

import static java.util.stream.Collectors.*;

public class UpperCase {
// }

public static Collection<String> mapToUppercase(String... names) {
	

    Collection<String> uppercaseNames = Arrays
        .asList(names)
        .stream()
        .map(String::toUpperCase)
        .collect(Collectors.toList());
            
            
    return uppercaseNames;
}

//{ autofold
}
//}
