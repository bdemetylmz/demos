package tr.com.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tr.com.demo.enums.City;
import tr.com.demo.enums.District;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class StudentDto {
    private String id;
    private String name;
    private String surname;
    private String phoneNumber;
    private City city;
    private District district;
    private String description;
    private Boolean deleted;
}
