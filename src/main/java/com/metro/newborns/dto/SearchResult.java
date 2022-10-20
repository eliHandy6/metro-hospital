package com.metro.newborns.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
/**
 * @Author :Zack Ogoma
 * zackogoma@gmail.com
 * Version:1.0.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchResult {

    List<NewBornDto> data;
}
