package com.tfauves.user.service;

import com.tfauves.user.VO.Department;
import com.tfauves.user.VO.ResponseTemplateVO;
import com.tfauves.user.enity.Users;
import com.tfauves.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RestTemplate restTemplate;

    public Users saveUser(Users users) {
        log.info("Inside saveUser: method of UserService");
        return userRepository.save(users);
    }

    public ResponseTemplateVO getUserWithDepartment(Long userId) {
        log.info("Inside getUserWithDepartment: method of UserService");
        ResponseTemplateVO vo = new ResponseTemplateVO();
        Users users = userRepository.findByUserId(userId);

        Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/department/" + users.getDepartmentId(),
                Department.class);

        vo.setUsers(users);
        vo.setDepartment(department);

        return vo;

    }
}
