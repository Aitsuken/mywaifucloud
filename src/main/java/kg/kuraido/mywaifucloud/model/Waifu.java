package kg.kuraido.mywaifucloud.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Waifu {
    @Id
    private Long id;
    private String name;
    private String price;
    private String imageUrl;
}
