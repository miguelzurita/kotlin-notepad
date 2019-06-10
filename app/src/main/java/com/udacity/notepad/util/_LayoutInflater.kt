package com.udacity.notepad.util

import android.content.Context
import android.view.LayoutInflater

/**
 * Created by MIKE PHENOM on 10/06/2019.
 */

/**
 * Creando una extension del Context, para disponer de un inflater
 */
val Context.layoutInflater get() = LayoutInflater.from(this)