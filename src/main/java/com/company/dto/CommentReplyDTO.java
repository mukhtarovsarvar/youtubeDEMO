package com.company.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CommentReplyDTO {

    @NotBlank(message = "CommentId required")
    private String commentId;

    @NotBlank(message = "Content required")
    private String content;

}
