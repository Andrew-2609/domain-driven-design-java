package com.ndrewcoding.escola.infra.aluno;

import com.ndrewcoding.escola.dominio.aluno.CifradorDeSenha;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {

    @Override
    public String cifrarSenha(String senha) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(senha.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = messageDigest.digest();
            StringBuilder stringBuilder = new StringBuilder();
            for (byte b : bytes) {
                stringBuilder.append(Integer.toString((b & 0xff) + 0x100, 16).substring(1));
            }
            return stringBuilder.toString();
        } catch (NoSuchAlgorithmException exception) {
            throw new RuntimeException("Erro ao gerar hash da senha passada.");
        }
    }

    @Override
    public boolean validarSenhaCifrada(String senha, String senhaCifrada) {
        return cifrarSenha(senha).equals(senhaCifrada);
    }

}
