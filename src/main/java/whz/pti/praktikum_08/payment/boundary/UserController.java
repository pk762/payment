package whz.pti.praktikum_08.payment.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import whz.pti.praktikum_08.payment.domain.UserDTO;
import whz.pti.praktikum_08.payment.service.PayUserService;

@RestController
public class UserController {

    @Autowired
    private PayUserService payUserService;

    @PostMapping("/users")
    public ResponseEntity<UserDTO> registerUser(@RequestBody UserDTO userDTO) {

        payUserService.openAccount(userDTO.getUserId(), userDTO.getUserLogin());
        return ResponseEntity.ok().body(userDTO);
    }
}
