package com.hc.parampassback.vo;

import lombok.Data;

/**
 * @author hechao
 */
@Data
public class Rs {

    private boolean status;

    private String message;

    public static Rs success(String message) {
        return new Rs(true, message);
    }

    public static Rs fail(String message) {
        return new Rs(false, message);
    }

    public Rs(boolean status, String message) {
        this.status = status;
        this.message = message;
    }
}
