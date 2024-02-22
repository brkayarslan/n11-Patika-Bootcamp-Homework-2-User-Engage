package com.berkayarslan.UserEngage.exceptions;

import com.berkayarslan.UserEngage.general.BaseErrorMessage;
import com.berkayarslan.UserEngage.general.BusinessException;

public class ItemNotFoundException extends BusinessException {

    public ItemNotFoundException(BaseErrorMessage baseErrorMessage) {
        super(baseErrorMessage);
    }
}
