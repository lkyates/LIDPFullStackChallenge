module.exports = {
  env: {
    browser: true,
    es2021: true,
    jasmine: true
  },
  extends: [
    'plugin:jasmine/recommended',
    'eslint:recommended',
    'google'
  ],
  parser: '@typescript-eslint/parser',
  parserOptions: {
    ecmaVersion: 12,
    sourceType: 'module'
  },
  plugins: [
    '@typescript-eslint',
    'jasmine'
  ],
  rules: {
    // Max line lengths for comments and code.
    'max-len': ['error', {code: 160, comments: 160}],

    'camelcase': 'off',

    // Recognizes line endings of 'CRLF' instead of 'LF'.
    'linebreak-style': ['error', 'windows'],

    // Requires '// Comment' over '//Comment'.
    // Allows '/****' for LIDP Copyright information.
    'spaced-comment': ['error', 'always', {exceptions: ['*']}],

    // Prevent the last element in an array from having a comma.
    'comma-dangle': ['error', 'never'],

    // Single quotes.
    'quotes': ['error', 'single', {'allowTemplateLiterals': true}],

    // JSDoc not required. See 'valid-jsdoc' below.
    'require-jsdoc': 'off',

    // If JSDoc IS included, it should meet requirements.
    'valid-jsdoc': ['error', {
      requireParamType: false,
      requireParamDescription: false,
      requireReturn: false,
      requireReturnType: false,
      requireReturnDescription: false,
      prefer: {returns: 'return'}
    }],

    // Prevents ESLint flagging Angular annotations as function naming errors.
    'new-cap': 'off',

    // Prevent inadvertent extension of native types. If a native type should be overridden,
    // ensure it is included here for deliberate exception.
    'no-extend-native': ['error', {'exceptions': ['String']}],

    // Prevents typescript method overloading
    'no-dupe-class-members': 'off',

    '@typescript-eslint/no-unused-vars': ['error', {args: 'none'}],
    'no-invalid-this': 'off'
  }
};
