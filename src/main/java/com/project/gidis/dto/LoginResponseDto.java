package com.project.gidis.dto;

import lombok.*;

@Builder
public class LoginResponseDto {
        public LoginResponseDto(boolean accedio) {
                this.accedio = accedio;
        }

        private boolean accedio;

        public LoginResponseDto() {
        }

        public boolean isAccedio() {
                return accedio;
        }

        public void setAccedio(boolean accedio) {
                this.accedio = accedio;
        }
}
