package whz.pti.praktikum_08.payment.dto;

import java.io.Serializable;

public class AccountResponseDTO implements Serializable {

    private String code;

    public AccountResponseDTO() {
    }

    public AccountResponseDTO(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
