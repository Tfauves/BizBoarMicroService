package com.tfauves.user.VO;

import com.tfauves.user.enity.Users;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private Users users;
    private Department department;
}
