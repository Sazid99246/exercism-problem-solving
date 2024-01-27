export const isPangram = str => {
    return new Set(str.toLowerCase().match(/[a-z]/g)).size === 26;
};