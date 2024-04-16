package com.von.kubernetesuser.common.service;

import com.von.kubernetesuser.common.component.MessengerVO;

public interface CommandService<T> {
      MessengerVO save(T t);
      MessengerVO deleteById(Long id);
      MessengerVO modify(T t);
}