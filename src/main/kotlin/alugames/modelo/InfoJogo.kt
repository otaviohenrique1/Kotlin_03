package org.example.alugames.modelo

import org.example.alugames.modelo.InfoApiShark

data class InfoJogo(val info: InfoApiShark) {
    override fun toString(): String {
        return info.toString()
    }
}