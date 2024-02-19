package com.berkayarslan.UserEngage.controller;

import com.berkayarslan.UserEngage.controller.contract.UserControllerContract;
import com.berkayarslan.UserEngage.dto.UserDTO;
import com.berkayarslan.UserEngage.general.RestResponse;
import com.berkayarslan.UserEngage.request.UserSaveRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


  private UserControllerContract userControllerContract;
    public UserController(UserControllerContract userControllerContract) {
        this.userControllerContract = userControllerContract;
    }

    @GetMapping
    public ResponseEntity<RestResponse<List<UserDTO>>> findAllUsers(){
        List<UserDTO> allUsers = userControllerContract.findAllUsers();
        return ResponseEntity.ok(RestResponse.of(allUsers));
    }

    @PostMapping
    public ResponseEntity<RestResponse<UserDTO>> save(@RequestBody UserSaveRequest request){
        UserDTO userDTO = userControllerContract.saveUser(request);
        return ResponseEntity.ok(RestResponse.of(userDTO));
    }


}
