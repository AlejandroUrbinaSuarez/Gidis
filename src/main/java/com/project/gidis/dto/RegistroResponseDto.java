package com.project.gidis.dto;

import lombok.*;

@Builder
public class RegistroResponseDto {
        public RegistroResponseDto(boolean guardo) {
                this.guardo = guardo;
        }

        private boolean guardo;

        public RegistroResponseDto() {
        }

        public boolean isGuardo() {
                return guardo;
        }

        public void setGuardo(boolean guardo) {
                this.guardo = guardo;
        }
}
