package com.giftech.jetheroes

import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.giftech.jetheroes.ui.theme.JetHeroesTheme

@Composable
fun JetHeroesApp(
    modifier: Modifier = Modifier,
) {
    Box(modifier = modifier) {
    }
}
@Preview(showBackground = true)
@Composable
fun JetHeroesAppPreview() {
    JetHeroesTheme {
        JetHeroesApp()
    }
}