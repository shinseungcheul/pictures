var path = require('path')

module.exports = {
    entry : './src/main/webapp/resources/js/app.js',
    cache: true,
    output: {
        path: __dirname,
        filename: './src/main/webapp/resources/js/dist/bundle.js'
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /(node_modules|bower_components)/,
                use: {
                    loader: 'babel-loader',
                    options: {
                        presets: ['babel-preset-es2015', 'babel-preset-react'],
                        cacheDirectory:true
                    }
                }
            }
        ]
    }
}