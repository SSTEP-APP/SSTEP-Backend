package com.sstep.demo.store.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StoreResponseDto {
    private long id;
    private String name;
    private String address;
    private String latitude;
    private String longitude;
    private boolean scale;
    private boolean plan;
    private String payday;
    private long code;
}