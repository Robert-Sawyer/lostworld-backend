package pl.lostworld.lostworldbackend.jsontemplate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pair<K, V> {
    private K field;
    private V value;
}
